package com.techfathers.mechanic_adda.ui.fragments

import android.os.Bundle
import android.view.ViewGroup
import android.widget.LinearLayout
import com.techfathers.mechanic_adda.R
import com.techfathers.mechanic_adda.databinding.FragmentIntroBinding
import com.techfathers.mechanic_adda.ui.adapters.IntroSliderAdapter
import com.techfathers.mechanic_adda.ui.base.BaseCallback
import com.techfathers.mechanic_adda.ui.base.BaseFragment
import com.techfathers.mechanic_adda.util.Constants
import com.techfathers.mechanic_adda.util.Constants.SHOW_INTRO_SCREEN
import com.techfathers.mechanic_adda.util.dpToPx
import com.techfathers.mechanic_adda.util.setBooleanValueFromSharePreference
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.kodein
import kotlin.math.roundToInt

/**
 * Property of Techfathers, Inc @ 2022 All Rights Reserved.
 */


class IntroFragment : BaseFragment<FragmentIntroBinding>(), KodeinAware {

    override val kodein by kodein()

    override fun getFragmentLayout(): Int {
        return R.layout.fragment_intro
    }

    override fun onFragmentCreateView(savedInstanceState: Bundle?) {
        super.onFragmentCreateView(savedInstanceState)
        initView()
    }

    private fun initView() {
        setBaseCallback(baseCallback)

        val mIntroSliderAdapter =
            IntroSliderAdapter(
                requireContext(),
                Constants.INTRO_BACKGROUNDS,
                Constants.INTRO_TITLES
            )

        binding.vpSlides.adapter = mIntroSliderAdapter

        binding.tabLayoutDots.setupWithViewPager(binding.vpSlides)

        setTabWidth()
    }

    private fun setTabWidth() {

        val tabs = binding.tabLayoutDots.getChildAt(0) as ViewGroup

        for (i in 0 until tabs.childCount) {
            val tab = tabs.getChildAt(i)
            val layoutParams = tab.layoutParams as LinearLayout.LayoutParams
            layoutParams.weight = 0f
            layoutParams.marginEnd = 2.dpToPx().roundToInt()
            layoutParams.marginStart = 2.dpToPx().toInt()
            layoutParams.width = 9.dpToPx().toInt()
            layoutParams.height = 9.dpToPx().toInt()
            tab.layoutParams = layoutParams
            binding.tabLayoutDots.requestLayout()
        }

        binding.tabLayoutDots.requestLayout()
    }

    private val baseCallback = BaseCallback { view ->
        when (view.id) {
            R.id.tv_skip -> moveToHome()
            R.id.img_walk_through -> {
                if (binding.vpSlides.currentItem == 2) {
                    moveToHome()
                } else {
                    binding.vpSlides.setCurrentItem(binding.vpSlides.currentItem + 1, true)
                }
            }
        }
    }

    private fun moveToHome() {
        context?.setBooleanValueFromSharePreference(SHOW_INTRO_SCREEN, false)
        goToHomeScreen()
    }
}