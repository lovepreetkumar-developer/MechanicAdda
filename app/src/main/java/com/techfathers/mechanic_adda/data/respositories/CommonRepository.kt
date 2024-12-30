package com.techfathers.mechanic_adda.data.respositories

import com.techfathers.mechanic_adda.data.network.FCMApis
import com.techfathers.mechanic_adda.data.network.SafeApiRequest
import com.techfathers.mechanic_adda.models.FCMSendNotificationResponse
import com.techfathers.mechanic_adda.models.SendNotificationBody

/**
 * Property of Techfathers, Inc @ 2022 All Rights Reserved.
 */

class CommonRepository(
    private val fcmApis: FCMApis
) : SafeApiRequest() {

    suspend fun sendNotificationToAdmin(
        sendNotificationBody: SendNotificationBody
    ): FCMSendNotificationResponse {
        return apiRequest { fcmApis.sendNotificationToAdmin(sendNotificationBody) }
    }

}