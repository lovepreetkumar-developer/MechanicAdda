package com.techfathers.mechanic_adda.ui.fragments

import android.content.Intent
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import com.google.android.gms.tasks.OnCompleteListener
import com.google.android.gms.tasks.Task
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.GenericTypeIndicator
import com.google.firebase.database.ValueEventListener
import com.google.firebase.messaging.FirebaseMessaging
import com.techfathers.mechanic_adda.BuildConfig
import com.techfathers.mechanic_adda.R
import com.techfathers.mechanic_adda.data.preferences.PreferenceProvider
import com.techfathers.mechanic_adda.databinding.FragmentLoginBinding
import com.techfathers.mechanic_adda.models.AdminModel
import com.techfathers.mechanic_adda.ui.activities.HomeActivity
import com.techfathers.mechanic_adda.ui.base.BaseCallback
import com.techfathers.mechanic_adda.ui.base.BaseFragment
import com.techfathers.mechanic_adda.ui.custom_views.circle_progress.CustomProgress
import com.techfathers.mechanic_adda.util.*
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.kodein
import org.kodein.di.generic.instance
import timber.log.Timber

/**
 * Property of Techfathers, Inc @ 2022 All Rights Reserved.
 */

class LoginFragment : BaseFragment<FragmentLoginBinding>(), KodeinAware {

    private val mProgressView: CustomProgress by instance()

    override val kodein by kodein()

    private val mPrefProvider: PreferenceProvider by instance()
    private val mFieldsValidator: FieldsValidator by instance()

    override fun getFragmentLayout(): Int {
        return R.layout.fragment_login
    }

    override fun onFragmentCreateView(savedInstanceState: Bundle?) {
        super.onFragmentCreateView(savedInstanceState)
        initView()
    }

    private fun initView() {
        setBaseCallback(baseCallback)
    }

    private val baseCallback = BaseCallback { view ->
        when (view.id) {
            R.id.img_cross -> goBack()
            R.id.img_eye -> eyeImageWork()
            R.id.btn_login -> if (validateFields()) {
                activity?.hideSoftKeyboard(binding.rlParent)
                validateWithServerCredentials()
            }
        }
    }

    private fun validateFields(): Boolean {
        return mFieldsValidator.hasText(binding.etEmail)
                && mFieldsValidator.hasText(binding.etPassword)
    }

    private fun eyeImageWork() {
        if (binding.etPassword.transformationMethod === PasswordTransformationMethod.getInstance()) {
            //Show Password
            binding.imgEye.setImageResource(R.drawable.ic_eye_visible)
            binding.etPassword.transformationMethod = HideReturnsTransformationMethod.getInstance()
        } else {
            //Hide Password
            binding.imgEye.setImageResource(R.drawable.ic_eye_invisible)
            binding.etPassword.transformationMethod = PasswordTransformationMethod.getInstance()
        }
        binding.etPassword.setSelection(
            binding.etPassword.text.toString().length
        )
    }

    private fun validateWithServerCredentials() {

        activity?.let { mProgressView.show(it) }
        getDatabaseReference().child(BuildConfig.SECRET_CODE)
            .child(BuildConfig.ADMIN)
            .addValueEventListener(object : ValueEventListener {
                override fun onDataChange(dataSnapshot: DataSnapshot) {

                    try {
                        val t: GenericTypeIndicator<AdminModel> = object :
                            GenericTypeIndicator<AdminModel>() {}
                        val adminModel: AdminModel? = dataSnapshot.getValue(t)
                        adminModel?.let { it ->
                            mProgressView.hide()
                            when {
                                it.email != binding.etEmail.text.toString() -> {
                                    context?.showMessageDialog(getString(R.string.email_is_not_valid))
                                }
                                it.password != binding.etPassword.text.toString() -> {
                                    context?.showMessageDialog(getString(R.string.password_is_not_valid))
                                }
                                else -> {
                                    storeFirebaseToken()
                                }
                            }
                        }
                    } catch (ex: Exception) {
                        ex.printStackTrace()
                    }
                }

                override fun onCancelled(databaseError: DatabaseError) {
                    Timber.d("Error :%s", databaseError.message)
                }
            })
    }

    private fun storeFirebaseToken() {
        FirebaseMessaging.getInstance().token.addOnCompleteListener { task1: Task<String> ->
            if (task1.isSuccessful) {
                getDatabaseReference().child(BuildConfig.SECRET_CODE)
                    .child(BuildConfig.ADMIN)
                    .child("token")
                    .setValue(task1.result)
                    .addOnCompleteListener { task2 ->
                        if (task2.isSuccessful) {
                            mPrefProvider.setFirebaseToken(task1.result)
                            mPrefProvider.setAdminLoggedIn(true)
                            val bundle = Bundle()
                            bundle.putString(
                                Constants.KEY_PURPOSE,
                                Constants.TRANSITION_ALL_REQUESTS_FRAGMENT
                            )
                            startActivity(Intent(
                                requireContext(),
                                HomeActivity::class.java
                            ).putExtras(bundle)
                                .also {
                                    it.flags =
                                        Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                                    goNextAnimation()
                                }
                            )
                        }
                    }
            } else {
                context?.showMessageDialog("Firebase token issue.")
            }
        }
    }
}