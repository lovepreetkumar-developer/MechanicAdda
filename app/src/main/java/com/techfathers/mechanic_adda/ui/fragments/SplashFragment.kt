package com.techfathers.mechanic_adda.ui.fragments

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.navigation.fragment.findNavController
import com.techfathers.mechanic_adda.R
import com.techfathers.mechanic_adda.data.preferences.PreferenceProvider
import com.techfathers.mechanic_adda.databinding.FragmentSplashBinding
import com.techfathers.mechanic_adda.ui.activities.HomeActivity
import com.techfathers.mechanic_adda.util.Constants
import com.techfathers.mechanic_adda.ui.base.BaseFragment
import com.techfathers.mechanic_adda.util.Constants.SHOW_INTRO_SCREEN
import com.techfathers.mechanic_adda.util.getBooleanValueFromSharePreference
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.kodein
import org.kodein.di.generic.instance

/**
 * Property of Techfathers, Inc @ 2022 All Rights Reserved.
 */

class SplashFragment : BaseFragment<FragmentSplashBinding>(), KodeinAware {

    override val kodein by kodein()

    private val mPrefProvider: PreferenceProvider by instance()

    private var mHandler: Handler? = null

    override fun getFragmentLayout(): Int {
        return R.layout.fragment_splash
    }

    override fun onFragmentCreateView(savedInstanceState: Bundle?) {
        super.onFragmentCreateView(savedInstanceState)
        initView()
    }

    override fun onDestroy() {
        mHandler?.removeCallbacks(mRunnable)
        super.onDestroy()
    }

    private fun initView() {
        mHandler = Handler(Looper.getMainLooper())
        mHandler?.postDelayed(mRunnable, Constants.SPLASH_TIME_OUT)
    }

    private val mRunnable = Runnable {
        context?.let { contextMe ->
            if (contextMe.getBooleanValueFromSharePreference(SHOW_INTRO_SCREEN)) {
                findNavController().navigate(SplashFragmentDirections.actionSplashFragmentToIntroFragment())
            } else {
                if (mPrefProvider.isAdminLoggedIn()) {
                    val bundle = Bundle()
                    bundle.putString(
                        Constants.KEY_PURPOSE,
                        Constants.TRANSITION_ALL_REQUESTS_FRAGMENT
                    )
                    startActivity(
                        Intent(
                            requireContext(),
                            HomeActivity::class.java
                        ).putExtras(bundle)
                            .also {
                                it.flags =
                                    Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                                goNextAnimation()
                            }
                    )
                } else {
                    goToHomeScreen()
                }
            }
        }
    }
}