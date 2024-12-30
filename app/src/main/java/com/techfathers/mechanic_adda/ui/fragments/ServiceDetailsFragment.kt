package com.techfathers.mechanic_adda.ui.fragments

import android.os.Bundle
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.navigation.fragment.findNavController
import com.techfathers.mechanic_adda.R
import com.techfathers.mechanic_adda.databinding.FragmentServiceDetailsBinding
import com.techfathers.mechanic_adda.models.ServiceModel
import com.techfathers.mechanic_adda.ui.adapters.ServiceDetailsSliderAdapter
import com.techfathers.mechanic_adda.ui.base.BaseCallback
import com.techfathers.mechanic_adda.ui.base.BaseFragmentAdvance
import com.techfathers.mechanic_adda.util.Constants
import com.techfathers.mechanic_adda.util.dpToPx
import kotlin.math.roundToInt

class ServiceDetailsFragment : BaseFragmentAdvance<FragmentServiceDetailsBinding>() {

    private var mServiceModel: ServiceModel? = null

    override fun getFragmentLayout(): Int = R.layout.fragment_service_details

    override fun onFragmentCreateView(savedInstanceState: Bundle?) {
        super.onFragmentCreateView(savedInstanceState)
        binding?.let {
            mainBinding = it
            initView()
        }
    }

    private fun initView() {
        setBaseCallback(baseCallback)
        val args = arguments?.let { ServiceDetailsFragmentArgs.fromBundle(it) }
        args?.let {
            mServiceModel = it.serviceModel
            mainBinding.model = mServiceModel
            mServiceModel?.let { model -> mainBinding.toolbar.tvTitle.text = model.title }
        }
        val mServiceDetailsSliderAdapter =
            ServiceDetailsSliderAdapter(
                requireContext(),
                Constants.SERVICE_DETAILS_SLIDER
            )

        mainBinding.vpSlides.adapter = mServiceDetailsSliderAdapter

        mainBinding.tabLayoutDots.setupWithViewPager(mainBinding.vpSlides)

        setTabWidth()
    }

    private fun setTabWidth() {

        val tabs = mainBinding.tabLayoutDots.getChildAt(0) as ViewGroup

        for (i in 0 until tabs.childCount) {
            val tab = tabs.getChildAt(i)
            val layoutParams = tab.layoutParams as LinearLayout.LayoutParams
            layoutParams.weight = 0f
            layoutParams.marginEnd = 2.dpToPx().roundToInt()
            layoutParams.marginStart = 2.dpToPx().toInt()
            layoutParams.width = 8.dpToPx().toInt()
            layoutParams.height = 8.dpToPx().toInt()
            tab.layoutParams = layoutParams
            mainBinding.tabLayoutDots.requestLayout()
        }

        mainBinding.tabLayoutDots.requestLayout()
    }

    private val baseCallback = BaseCallback {
        when (it.id) {
            R.id.img_back -> goBack()
            R.id.tv_consult -> findNavController().navigate(
                ServiceDetailsFragmentDirections.actionServiceDetailsFragmentToBookRequestFragment(
                    Constants.REQUEST_TYPE_PERIODIC_SERVICE,
                    mServiceModel
                )
            )
        }
    }
}