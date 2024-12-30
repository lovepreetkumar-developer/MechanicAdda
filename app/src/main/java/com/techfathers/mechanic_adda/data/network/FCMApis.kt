package com.techfathers.mechanic_adda.data.network

import com.google.gson.GsonBuilder
import com.techfathers.mechanic_adda.models.FCMSendNotificationResponse
import com.techfathers.mechanic_adda.models.SendNotificationBody
import com.techfathers.mechanic_adda.util.BasicFCMAuthInterceptor
import com.techfathers.mechanic_adda.util.Constants
import com.techfathers.mechanic_adda.util.Constants.SEND_FCM_NOTIFICATION
import okhttp3.OkHttpClient
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.POST
import java.util.concurrent.TimeUnit

/**
 * Property of Techfathers, Inc @ 2022 All Rights Reserved.
 */

interface FCMApis {

    @POST(SEND_FCM_NOTIFICATION)
    suspend fun sendNotificationToAdmin(
        @Body sendNotificationBody: SendNotificationBody
    ): Response<FCMSendNotificationResponse>

    companion object {
        operator fun invoke(
            networkConnectionInterceptor: NetworkConnectionInterceptor
        ): FCMApis {

            val okHttpClient = OkHttpClient.Builder()
                .addInterceptor(BasicFCMAuthInterceptor())
                .addInterceptor(networkConnectionInterceptor)
                .readTimeout(30, TimeUnit.SECONDS)
                .build()

            val gson = GsonBuilder()
                .setLenient()
                .create()

            return Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl(Constants.BASE_URL_FCM)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build()
                .create(FCMApis::class.java)
        }
    }
}