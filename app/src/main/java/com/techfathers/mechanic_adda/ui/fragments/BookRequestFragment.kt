package com.techfathers.mechanic_adda.ui.fragments

import android.animation.Animator
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import com.techfathers.mechanic_adda.BuildConfig
import com.techfathers.mechanic_adda.R
import com.techfathers.mechanic_adda.databinding.FragmentBookRequestBinding
import com.techfathers.mechanic_adda.models.*
import com.techfathers.mechanic_adda.ui.base.BaseCallback
import com.techfathers.mechanic_adda.ui.base.BaseFragment
import com.techfathers.mechanic_adda.ui.custom_views.circle_progress.CustomProgress
import com.techfathers.mechanic_adda.util.*
import com.techfathers.mechanic_adda.view_models.HomeViewModel
import com.techfathers.mechanic_adda.vm_factories.HomeViewModelFactory
import kotlinx.coroutines.launch
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.kodein
import org.kodein.di.generic.instance
import timber.log.Timber
import java.util.*

/**
 * Property of Techfathers, Inc @ 2022 All Rights Reserved.
 */


class BookRequestFragment : BaseFragment<FragmentBookRequestBinding>(), KodeinAware {

    override val kodein by kodein()

    private val mProgressView: CustomProgress by instance()
    private val mFieldValidator: FieldsValidator by instance()
    private val mFactory: HomeViewModelFactory by instance()

    private lateinit var mHomeViewModel: HomeViewModel

    private var mServiceModel: ServiceModel? = null
    private lateinit var mRequestType: String

    override fun getFragmentLayout(): Int {
        return R.layout.fragment_book_request
    }

    override fun onFragmentCreateView(savedInstanceState: Bundle?) {
        super.onFragmentCreateView(savedInstanceState)
        initView()
    }

    private fun initView() {
        setBaseCallback(baseCallback)

        mHomeViewModel = ViewModelProvider(this, mFactory).get(HomeViewModel::class.java)

        val args = arguments?.let { BookRequestFragmentArgs.fromBundle(it) }
        args?.let {
            mRequestType = it.requestType
            mServiceModel = it.serviceModel
            binding.model = mServiceModel
            when (mRequestType) {
                Constants.REQUEST_TYPE_PERIODIC_SERVICE -> binding.toolbar.tvTitle.text =
                    mServiceModel!!.title
                Constants.REQUEST_TYPE_CUSTOM_SERVICE -> {
                    binding.tvPayment.visibility = View.VISIBLE
                    binding.toolbar.tvTitle.text =
                        getString(R.string.custom_service)
                }
                Constants.REQUEST_TYPE_HIRE_MECHANIC -> binding.toolbar.tvTitle.text =
                    getString(R.string.hire_mechanic)
            }
        }
    }

    private val baseCallback = BaseCallback { view ->
        when (view.id) {
            R.id.img_back -> goBack()
            R.id.tv_action -> if (validateFields()) submitRequest()
        }
    }

    private fun validateFields(): Boolean {
        return mFieldValidator.hasText(binding.etFullName) &&
                mFieldValidator.hasText(binding.etMobileNo) &&
                mFieldValidator.hasText(binding.etLocation) &&
                mFieldValidator.hasText(binding.etComments)
    }

    private fun submitRequest() {

        mProgressView.show(requireActivity())

        val requestId = UUID.randomUUID().toString()
        val requestModel = RequestModel(
            id = requestId,
            full_name = binding.etFullName.text.toString(),
            email = binding.etEmail.text.toString(),
            mobile_no = binding.etMobileNo.text.toString(),
            location = binding.etLocation.text.toString(),
            type = mRequestType,
            comments = binding.etComments.text.toString()
        )

        getDatabaseReference().child(BuildConfig.SECRET_CODE)
            .child(Constants.TREE_REQUESTS)
            .child(requestId)
            .setValue(requestModel).addOnCompleteListener(requireActivity()) { task ->
                mProgressView.hide()
                if (task.isSuccessful) {

                    getAdminFirebaseToken(requestModel)

                    binding.etFullName.setText("")
                    binding.etEmail.setText("")
                    binding.etMobileNo.setText("")
                    binding.etLocation.setText("")
                    binding.etComments.setText("")

                    binding.rlWholeView.visibility = View.GONE
                    binding.rlViewLottie.visibility = View.VISIBLE

                    binding.lottieAnimation.speed = 0.5F
                    binding.lottieAnimation.addAnimatorListener(object : Animator.AnimatorListener {
                        override fun onAnimationStart(animation: Animator?) {
                            Timber.e("Animation:", "start")
                        }

                        override fun onAnimationEnd(animation: Animator?) {
                            binding.tvMessage.visibility = View.VISIBLE
                        }

                        override fun onAnimationCancel(animation: Animator?) {
                            Timber.e("Animation:", "cancel")
                        }

                        override fun onAnimationRepeat(animation: Animator?) {
                            Timber.e("Animation:", "repeat")
                        }
                    })
                    binding.lottieAnimation.playAnimation()

                } else {
                    task.exception?.message?.let { message ->
                        Timber.d(message)
                    }
                }
            }
    }

    private fun getAdminFirebaseToken(requestModel: RequestModel) {
        getDatabaseReference().child(BuildConfig.SECRET_CODE)
            .child(BuildConfig.ADMIN)
            .addValueEventListener(object : ValueEventListener {
                override fun onDataChange(snapshot: DataSnapshot) {

                    val adminModel: AdminModel? =
                        snapshot.getValue(AdminModel::class.java)
                    adminModel?.let {
                        if (adminModel.token.isNotEmpty()) {
                            sendNotificationToAdmin(requestModel, adminModel)
                        }
                    }
                }

                override fun onCancelled(databaseError: DatabaseError) {
                    Timber.d("Error :%s", databaseError.message)
                }
            })
    }

    private fun sendNotificationToAdmin(requestModel: RequestModel, adminModel: AdminModel) {

        lifecycleScope.launch {
            try {

                val notificationBody = SendNotificationBody()
                notificationBody.to = adminModel.token
                val notificationDataModel = NotificationDataModel()
                notificationDataModel.body = "Mobile No: " + requestModel.mobile_no
                notificationDataModel.title =
                    requestModel.full_name + " want " + requestModel.type + " at " + requestModel.location

                notificationBody.data = notificationDataModel

                val response =
                    mHomeViewModel.sendNotificationToAdmin(notificationBody)
                mProgressView.hide()

                Timber.d("test")

            } catch (ex: MyApiException) {
                mProgressView.hide()
                ex.printStackTrace()
            } catch (ex: NoInternetException) {
                mProgressView.hide()
                ex.printStackTrace()
            } catch (ex: Exception) {
                mProgressView.hide()
                ex.printStackTrace()
            }
        }

    }
}