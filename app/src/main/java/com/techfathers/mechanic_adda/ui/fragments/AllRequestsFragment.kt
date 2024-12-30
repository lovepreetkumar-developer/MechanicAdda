package com.techfathers.mechanic_adda.ui.fragments

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.View
import android.view.Window
import androidx.navigation.fragment.findNavController
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import com.techfathers.mechanic_adda.BuildConfig
import com.techfathers.mechanic_adda.R
import com.techfathers.mechanic_adda.data.preferences.PreferenceProvider
import com.techfathers.mechanic_adda.databinding.DialogAlertBinding
import com.techfathers.mechanic_adda.databinding.FragmentAllRequestsBinding
import com.techfathers.mechanic_adda.databinding.ItemBookedRequestBinding
import com.techfathers.mechanic_adda.models.RequestModel
import com.techfathers.mechanic_adda.ui.base.*
import com.techfathers.mechanic_adda.ui.custom_views.circle_progress.CustomProgress
import com.techfathers.mechanic_adda.util.Constants
import com.techfathers.mechanic_adda.util.getDatabaseReference
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.GroupieViewHolder
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.kodein
import org.kodein.di.generic.instance
import timber.log.Timber
import java.util.*

/**
 * Property of Techfathers, Inc @ 2022 All Rights Reserved.
 */

class AllRequestsFragment : BaseFragment<FragmentAllRequestsBinding>(),
    KodeinAware {

    override val kodein by kodein()

    private val mPrefProvider: PreferenceProvider by instance()
    private val mProgressView: CustomProgress by instance()

    private var mRequestsAdapter = GroupAdapter<GroupieViewHolder>()
    private var mLogoutWarningDialog: BaseCustomDialog<DialogAlertBinding>? = null

    override fun getFragmentLayout(): Int = R.layout.fragment_all_requests

    override fun onFragmentCreateView(savedInstanceState: Bundle?) {
        super.onFragmentCreateView(savedInstanceState)
        initView()
    }

    private fun initView() {
        setBaseCallback(baseCallback)
        binding.rvRequests.adapter = mRequestsAdapter
        getAllRequests()
    }

    private fun getAllRequests() {
        activity?.let { mProgressView.show(it) }
        getDatabaseReference().child(BuildConfig.SECRET_CODE)
            .child(Constants.TREE_REQUESTS)
            .orderByChild("resolved")
            .equalTo(false)
            .addValueEventListener(object : ValueEventListener {

                override fun onDataChange(dataSnapshot: DataSnapshot) {

                    if (dataSnapshot.value == null) {
                        noRequestFound()
                    } else {
                        val listOfRequests: MutableList<RequestModel> = ArrayList()
                        for (valueRes in dataSnapshot.children) {
                            val restaurantModel: RequestModel? =
                                valueRes.getValue(RequestModel::class.java)
                            restaurantModel?.let { listOfRequests.add(it) }
                        }
                        if (listOfRequests.isNotEmpty()) {
                            mRequestsAdapter.clear()
                            mProgressView.hide()
                            requestFound()
                            mRequestsAdapter.addAll(listOfRequests.toBookedRequestItems())
                        }
                    }
                }

                override fun onCancelled(databaseError: DatabaseError) {
                    Timber.d("Error :%s", databaseError.message)
                    noRequestFound()
                }
            })
    }

    private fun noRequestFound() {
        mProgressView.hide()
        binding.rvRequests.visibility = View.GONE
        binding.tvNoRequestFound.visibility = View.VISIBLE
    }

    private fun requestFound() {
        mProgressView.hide()
        binding.rvRequests.visibility = View.VISIBLE
        binding.tvNoRequestFound.visibility = View.GONE
    }

    private fun List<RequestModel>.toBookedRequestItems(): List<BaseItem<RequestModel, ItemBookedRequestBinding>> {
        return this.map {
            BaseItem(
                R.layout.item_booked_request,
                it,
                object : BaseItem.OnItemClickListener<RequestModel> {
                    override fun onItemClick(view: View, model: RequestModel, position: Int) {
                        findNavController().navigate(
                            AllRequestsFragmentDirections.actionAllRequestsFragmentToRequestDetailsFragment(
                                model
                            )
                        )
                    }
                }
            )
        }
    }

    private val baseCallback = BaseCallback {
        if (it.id == R.id.img_logout) showAlertDialog()
    }

    private fun showAlertDialog() {
        mLogoutWarningDialog = BaseCustomDialog(
            requireContext(),
            R.layout.dialog_alert,
            object : BaseCustomDialog.DialogListener {
                override fun onViewClick(view: View?) {
                    view?.let {
                        when (it.id) {
                            R.id.btn_cancel -> mLogoutWarningDialog?.dismiss()
                            R.id.btn_ok -> {
                                mLogoutWarningDialog?.dismiss()
                                mPrefProvider.setAdminLoggedIn(false)
                                goToMainScreen()
                            }
                            else -> mLogoutWarningDialog?.dismiss()
                        }
                    }
                }
            })

        Objects.requireNonNull<Window>(mLogoutWarningDialog?.window).setBackgroundDrawable(
            ColorDrawable(
                Color.TRANSPARENT
            )
        )
        mLogoutWarningDialog?.getBinding()?.tvMessage?.text =
            getString(R.string.are_you_sure_to_logout)
        mLogoutWarningDialog?.setCancelable(true)
        mLogoutWarningDialog?.show()
    }
}