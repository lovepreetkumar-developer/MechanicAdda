package com.techfathers.mechanic_adda.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

/**
 * Property of Techfathers, Inc @ 2022 All Rights Reserved.
 */

@Parcelize
data class ServiceModel(
    val title: String,
    val price: String,
    val d_price: String
) : Parcelable