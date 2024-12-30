package com.techfathers.mechanic_adda.util

import android.Manifest
import com.techfathers.mechanic_adda.R

/**
 * Property of Techfathers, Inc @ 2022 All Rights Reserved.
 */

object Constants {

    /**Apis End Points*/
    const val BASE_URL_FCM = "https://fcm.googleapis.com/fcm/"
    const val SEND_FCM_NOTIFICATION = "send"

    const val SPLASH_TIME_OUT = 2000L
    const val PUBLIC_SHARED_PREFERENCE = "PUBLIC_SHARED_PREFERENCE"
    const val SHOW_INTRO_SCREEN = "show_intro_screen"
    const val KEY_PURPOSE = "key_purpose"
    const val ADMIN_LOGGED_IN = "admin_logged_in"
    const val FIREBASE_TOKEN = "firebase_token"

    /*****Transitions******/
    const val TRANSITION_ALL_REQUESTS_FRAGMENT = "all_requests_fragment"

    /*****Database Trees******/
    const val TREE_REQUESTS = "requests"

    /*****Screens******/
    const val REQUEST_TYPE_CUSTOM_SERVICE = "Custom Service"
    const val REQUEST_TYPE_PERIODIC_SERVICE = "Periodic Service"
    const val REQUEST_TYPE_HIRE_MECHANIC = "Hire Mechanic"

    /*****Intro Images******/
    val INTRO_BACKGROUNDS = arrayOf(
        R.drawable.ic_welcome_slide_1,
        R.drawable.ic_welcome_slide_2,
        R.drawable.ic_welcome_slide_3
    )

    /*****Intro Titles******/
    val INTRO_TITLES = arrayOf(
        "Start",
        "Service",
        "Wash"
    )

    /*****Workshops Images******/
    val WORKSHOPS_BACKGROUNDS = arrayOf(
        R.drawable.image_workshop_1,
        R.drawable.image_workshop_2,
        R.drawable.image_workshop_3
    )

    /*****Workshops Titles******/
    val WORKSHOPS_TITLES = arrayOf(
        "Hyundai Car Periodic",
        "Tata Car Periodic",
        "Honda Car Periodic"
    )

    val SERVICES_TITLES = arrayOf(
        "Basic Service",
        "Standard Service",
        "Platinum Service"
    )

    val SERVICES_MAIN_PRICES = arrayOf(
        "₹3099.00",
        "₹4099.00",
        "₹5099.00"
    )

    val SERVICES_DISCOUNTED_PRICES = arrayOf(
        "₹2099.00",
        "₹2599.00",
        "₹3099.00",
    )

    /*****Service Details Image******/
    val SERVICE_DETAILS_SLIDER = arrayOf(
        R.drawable.image_service_1,
        R.drawable.image_service_2,
        R.drawable.image_service_3,
        R.drawable.image_service_4
    )
}