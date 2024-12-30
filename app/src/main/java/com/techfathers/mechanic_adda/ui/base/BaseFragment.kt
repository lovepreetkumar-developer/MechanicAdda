package com.techfathers.mechanic_adda.ui.base

import android.content.Context
import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.CallSuper
import androidx.appcompat.widget.AppCompatImageView
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.databinding.library.baseAdapters.BR
import androidx.fragment.app.Fragment
import com.techfathers.mechanic_adda.R
import com.techfathers.mechanic_adda.ui.activities.HomeActivity
import com.techfathers.mechanic_adda.ui.activities.MainActivity
import java.util.*

/**
 * Property of Techfathers, Inc @ 2022 All Rights Reserved.
 */

abstract class BaseFragment<V : ViewDataBinding> : Fragment() {

    protected lateinit var binding: V
    protected var baseContext: Context? = null
    //private var mMessageDialog: BaseCustomDialog<DialogMessageBinding>? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        this.baseContext = context
    }

    protected open fun setBaseCallback(baseCallback: BaseCallback?) {
        binding.setVariable(BR.callback, baseCallback)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(
            inflater,
            getFragmentLayout(),
            container,
            false
        )

        onFragmentCreateView(savedInstanceState)

        return binding.root
    }


    @CallSuper
    protected open fun onFragmentCreateView(savedInstanceState: Bundle?) {
    }

    protected abstract fun getFragmentLayout(): Int

    protected open fun goBack() {
        requireActivity().onBackPressed()
        requireActivity().overridePendingTransition(
            R.anim.activity_back_in,
            R.anim.activity_back_out
        )
    }

    protected open fun goNextAnimation() {
        requireActivity().overridePendingTransition(
            R.anim.activity_in,
            R.anim.activity_out
        )
    }

    protected open fun goBackAnimation() {
        requireActivity().overridePendingTransition(
            R.anim.activity_back_in,
            R.anim.activity_back_out
        )
    }

    protected open fun loadLocalCircleImage(path: String, imageView: AppCompatImageView) {
        if (path.isNotEmpty()) {
            /*Picasso.get().load(File(path))
                .placeholder(R.drawable.ic_user_placeholder)
                .transform(CircleImageTransform())
                .into(imageView)*/
        }
    }

    protected open fun goToHomeScreen() {
        startActivity(
            Intent(
                requireContext(),
                HomeActivity::class.java
            ).also {
                it.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                goNextAnimation()
            }
        )
    }

    protected fun goToMainScreen() {
        requireContext().startActivity(
            Intent(
                requireContext(),
                MainActivity::class.java
            ).also {
                it.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                goNextAnimation()
            }
        )
    }

    open fun convertUIDirection(): Locale? {
        val languageToLoad = "en"
        val locale = Locale(languageToLoad)
        Locale.setDefault(locale)
        val config = Configuration()
        config.locale = locale
        baseContext!!.resources.updateConfiguration(
            config,
            baseContext!!.resources.displayMetrics
        )
        return locale
    }
}