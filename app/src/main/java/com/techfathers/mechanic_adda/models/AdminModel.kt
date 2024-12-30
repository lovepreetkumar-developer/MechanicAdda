package com.techfathers.mechanic_adda.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

/**
 * Property of Techfathers, Inc @ 2022 All Rights Reserved.
 */

@Parcelize
data class AdminModel(
    var email: String = "",
    var password: String = "",
    var token: String = ""
) : Parcelable