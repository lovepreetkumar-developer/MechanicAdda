package com.techfathers.mechanic_adda.util

import com.techfathers.mechanic_adda.BuildConfig
import okhttp3.Interceptor
import okhttp3.Response

/**
 * Property of TicketShala, Inc @ 2021 All Rights Reserved.
 */

class BasicFCMAuthInterceptor : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {

        val builder = chain.request().newBuilder()
        builder.header("Authorization", "key=${BuildConfig.FIREBASE_SERVER_KEY}")
        builder.header("Content-Type", "application/json")
        return chain.proceed(builder.build())
    }
}