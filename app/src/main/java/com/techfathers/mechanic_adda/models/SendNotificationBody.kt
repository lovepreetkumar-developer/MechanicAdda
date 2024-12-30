package com.techfathers.mechanic_adda.models

data class SendNotificationBody(
    var `data`: NotificationDataModel = NotificationDataModel(),
    var to: String = ""
)

data class NotificationDataModel(
    var body: String = "",
    var title: String = ""
)