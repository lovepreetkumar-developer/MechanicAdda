package com.techfathers.mechanic_adda.ui.fragments

import android.animation.Animator
import android.os.Bundle
import android.view.View
import com.techfathers.mechanic_adda.BuildConfig
import com.techfathers.mechanic_adda.R
import com.techfathers.mechanic_adda.databinding.FragmentRequestDetailsBinding
import com.techfathers.mechanic_adda.ui.base.BaseCallback
import com.techfathers.mechanic_adda.ui.base.BaseFragmentAdvance
import com.techfathers.mechanic_adda.util.Constants
import com.techfathers.mechanic_adda.util.getDatabaseReference
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.kodein
import timber.log.Timber

/**
 * Property of Techfathers, Inc @ 2022 All Rights Reserved.
 */

class RequestDetailsFragment : BaseFragmentAdvance<FragmentRequestDetailsBinding>(),
    KodeinAware {

    override val kodein by kodein()

    override fun getFragmentLayout(): Int = R.layout.fragment_request_details

    override fun onFragmentCreateView(savedInstanceState: Bundle?) {
        super.onFragmentCreateView(savedInstanceState)
        binding?.let {
            mainBinding = it
            initView()
        }
    }

    private fun initView() {
        setBaseCallback(baseCallback)
        mainBinding.toolbar.tvTitle.text = getString(R.string.request_details)
        val args = arguments?.let { RequestDetailsFragmentArgs.fromBundle(it) }
        args?.let {
            mainBinding.model = it.requestModel
        }
    }

    private val baseCallback = BaseCallback {
        when (it.id) {
            R.id.img_back -> goBack()
            R.id.tv_mark -> markRequestComplete()
        }
    }

    private fun markRequestComplete() {
        mainBinding.model?.let { requestModel ->
            requestModel.resolved = true
            getDatabaseReference().child(BuildConfig.SECRET_CODE)
                .child(Constants.TREE_REQUESTS)
                .child(requestModel.id)
                .setValue(requestModel)
                .addOnCompleteListener { task ->
                    if (task.isSuccessful) {
                        showLottie()
                    }
                }
        }
    }

    private fun showLottie() {
        mainBinding.rlWholeView.visibility = View.GONE
        mainBinding.rlViewLottie.visibility = View.VISIBLE

        mainBinding.lottieAnimation.speed = 0.5F
        mainBinding.lottieAnimation.addAnimatorListener(object : Animator.AnimatorListener {
            override fun onAnimationStart(animation: Animator?) {
                Timber.e("Animation:", "start")
            }

            override fun onAnimationEnd(animation: Animator?) {
                mainBinding.tvMessage.visibility = View.VISIBLE
            }

            override fun onAnimationCancel(animation: Animator?) {
                Timber.e("Animation:", "cancel")
            }

            override fun onAnimationRepeat(animation: Animator?) {
                Timber.e("Animation:", "repeat")
            }
        })
        mainBinding.lottieAnimation.playAnimation()
    }
}