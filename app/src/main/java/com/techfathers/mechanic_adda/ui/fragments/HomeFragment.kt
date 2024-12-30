package com.techfathers.mechanic_adda.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.core.view.GravityCompat
import androidx.navigation.fragment.findNavController
import com.techfathers.mechanic_adda.R
import com.techfathers.mechanic_adda.databinding.FragmentHomeBinding
import com.techfathers.mechanic_adda.databinding.ItemNearWorkshopsBinding
import com.techfathers.mechanic_adda.models.WorkshopModel
import com.techfathers.mechanic_adda.ui.base.BaseCallback
import com.techfathers.mechanic_adda.ui.base.BaseFragmentAdvance
import com.techfathers.mechanic_adda.ui.base.BaseItem
import com.techfathers.mechanic_adda.util.Constants
import com.techfathers.mechanic_adda.util.showAlert
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.GroupieViewHolder
import timber.log.Timber

/**
 * Property of Techfathers, Inc @ 2022 All Rights Reserved.
 */

class HomeFragment : BaseFragmentAdvance<FragmentHomeBinding>() {

    private var mWorkshopsAdapter = GroupAdapter<GroupieViewHolder>()

    override fun getFragmentLayout(): Int {
        return R.layout.fragment_home
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.let {
            mainBinding = it
            initView()
        }
    }

    private fun initView() {
        setBaseCallback(baseCallback)
        val listOfWorkshops = mutableListOf<WorkshopModel>()
        for (record in Constants.WORKSHOPS_BACKGROUNDS.withIndex()) {
            val model = WorkshopModel(
                Constants.WORKSHOPS_TITLES[record.index],
                Constants.WORKSHOPS_BACKGROUNDS[record.index]
            )
            listOfWorkshops.add(model)
        }
        mWorkshopsAdapter.addAll(listOfWorkshops.toWorkshopItems())
        mainBinding.appBarHome.rvWorkshops.adapter = mWorkshopsAdapter
    }

    private fun List<WorkshopModel>.toWorkshopItems(): List<BaseItem<WorkshopModel, ItemNearWorkshopsBinding>> {
        return this.map {
            BaseItem(
                R.layout.item_near_workshops,
                it,
                object : BaseItem.OnItemClickListener<WorkshopModel> {
                    override fun onItemClick(view: View, model: WorkshopModel, position: Int) {

                    }
                }
            )
        }
    }

    private val baseCallback = BaseCallback {
        when (it.id) {
            R.id.img_menu -> mainBinding.drawerLayout.openDrawer(GravityCompat.START)
            R.id.rl_admin_login -> findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToLoginFragment())
            R.id.ll_periodic_services -> findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToPeriodicServicesFragment())
            R.id.ll_custom_services -> findNavController().navigate(
                HomeFragmentDirections.actionHomeFragmentToBookRequestFragment(
                    Constants.REQUEST_TYPE_CUSTOM_SERVICE,
                    null
                )
            )
            R.id.ll_hire_mechanic -> findNavController().navigate(
                HomeFragmentDirections.actionHomeFragmentToBookRequestFragment(
                    Constants.REQUEST_TYPE_HIRE_MECHANIC,
                    null
                )
            )
        }
    }
}