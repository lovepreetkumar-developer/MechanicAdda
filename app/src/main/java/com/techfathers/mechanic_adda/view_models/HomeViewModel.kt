package com.techfathers.mechanic_adda.view_models

import androidx.lifecycle.ViewModel
import com.techfathers.mechanic_adda.data.respositories.CommonRepository
import com.techfathers.mechanic_adda.models.SendNotificationBody
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

/**
 * Property of Techfathers, Inc @ 2022 All Rights Reserved.
 */

class HomeViewModel(
    private val mainRepository: CommonRepository
) : ViewModel() {

    suspend fun sendNotificationToAdmin(
        sendNotificationBody: SendNotificationBody
    ) = withContext(Dispatchers.IO) {
        mainRepository.sendNotificationToAdmin(sendNotificationBody)
    }

}