package com.techfathers.mechanic_adda.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.techfathers.mechanic_adda.R
import com.techfathers.mechanic_adda.databinding.FragmentPeriodicServicesBinding
import com.techfathers.mechanic_adda.databinding.ItemPeriodicServiceBinding
import com.techfathers.mechanic_adda.models.ServiceModel
import com.techfathers.mechanic_adda.ui.base.BaseCallback
import com.techfathers.mechanic_adda.ui.base.BaseFragmentAdvance
import com.techfathers.mechanic_adda.ui.base.BaseItem
import com.techfathers.mechanic_adda.util.Constants
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.GroupieViewHolder

class PeriodicServicesFragment : BaseFragmentAdvance<FragmentPeriodicServicesBinding>() {

    private var mServicesAdapter = GroupAdapter<GroupieViewHolder>()

    override fun getFragmentLayout(): Int = R.layout.fragment_periodic_services

    override fun onFragmentCreateView(savedInstanceState: Bundle?) {
        super.onFragmentCreateView(savedInstanceState)
        binding?.let {
            mainBinding = it
            initView()
        }
    }

    private fun initView() {
        setBaseCallback(baseCallback)
        mainBinding.toolbar.tvTitle.text = getString(R.string.periodic_services)
        val listOfServices = mutableListOf<ServiceModel>()
        for (record in Constants.SERVICES_TITLES.withIndex()) {
            val model = ServiceModel(
                Constants.SERVICES_TITLES[record.index],
                Constants.SERVICES_MAIN_PRICES[record.index],
                Constants.SERVICES_DISCOUNTED_PRICES[record.index]
            )
            listOfServices.add(model)
        }
        mServicesAdapter.addAll(listOfServices.toServiceItems())
        mainBinding.rvServices.adapter = mServicesAdapter
    }

    private fun List<ServiceModel>.toServiceItems(): List<BaseItem<ServiceModel, ItemPeriodicServiceBinding>> {
        return this.map {
            BaseItem(
                R.layout.item_periodic_service,
                it,
                object : BaseItem.OnItemClickListener<ServiceModel> {
                    override fun onItemClick(view: View, model: ServiceModel, position: Int) {
                        findNavController().navigate(
                            PeriodicServicesFragmentDirections.actionPeriodicServicesFragmentToServiceDetailsFragment(
                                model
                            )
                        )
                    }
                }
            )
        }
    }

    private val baseCallback = BaseCallback {
        when (it.id) {
            R.id.img_back -> goBack()
        }
    }
}