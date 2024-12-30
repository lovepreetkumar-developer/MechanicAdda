package com.techfathers.mechanic_adda.models

data class FCMSendNotificationResponse(
    val canonical_ids: Int = 0,
    val failure: Int = 0,
    val multicast_id: Long = 0,
    val results: List<Result> = listOf(),
    val success: Int = 0
) {
    data class Result(
        val message_id: String = ""
    )
}