package com.techfathers.mechanic_adda.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class RequestModel(
    val id: String = "",
    val full_name: String = "",
    val email: String = "",
    val mobile_no: String = "",
    val location: String = "",
    val comments: String = "",
    val type: String = "",
    var resolved: Boolean = false
) : Parcelable