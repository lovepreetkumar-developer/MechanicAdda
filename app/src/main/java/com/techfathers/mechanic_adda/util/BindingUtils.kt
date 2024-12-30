package com.techfathers.mechanic_adda.util

import android.graphics.Paint
import android.graphics.drawable.Drawable
import android.view.View
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions

/**
 * Property of Techfathers, Inc @ 2022 All Rights Reserved.
 */

class BindingUtils {

    companion object {

        @BindingAdapter(value = ["simple_resource"])
        @JvmStatic
        fun simpleResource(imageView: AppCompatImageView, simpleResource: Int) {
            if (simpleResource != -1) imageView.setImageResource(simpleResource)
        }

        @BindingAdapter(value = ["setCustomBackground"])
        @JvmStatic
        fun setCustomBackground(view: View, simpleResource: Int) {
            if (simpleResource != -1) view.setBackgroundResource(simpleResource)
        }

        @BindingAdapter(value = ["load_gif", "placeholder"], requireAll = false)
        @JvmStatic
        fun loadGifImage(
            appCompatImageView: AppCompatImageView,
            imageUrl: String,
            placeholder: Drawable?
        ) {
            Glide.with(appCompatImageView.context)
                .asGif()
                .placeholder(placeholder)
                .load(imageUrl)
                .transition(DrawableTransitionOptions.withCrossFade())
                .diskCacheStrategy(DiskCacheStrategy.RESOURCE)
                .into(appCompatImageView)
        }

        @BindingAdapter(value = ["setSelectedTrueString"])
        @JvmStatic
        fun setSelectedTrueString(textView: AppCompatTextView, string: String?) {
            textView.isSelected = true
        }

        @BindingAdapter(value = ["set_strike_through_text_flag"])
        @JvmStatic
        fun setStrikeThroughTextFlag(textView: AppCompatTextView, string: String?) {
            textView.paintFlags = textView.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
        }

    }
}