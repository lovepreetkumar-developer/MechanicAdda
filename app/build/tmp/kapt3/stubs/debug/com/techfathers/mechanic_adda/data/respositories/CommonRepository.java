package com.techfathers.mechanic_adda.data.respositories;

import java.lang.System;

/**
 * Property of Techfathers, Inc @ 2022 All Rights Reserved.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/techfathers/mechanic_adda/data/respositories/CommonRepository;", "Lcom/techfathers/mechanic_adda/data/network/SafeApiRequest;", "fcmApis", "Lcom/techfathers/mechanic_adda/data/network/FCMApis;", "(Lcom/techfathers/mechanic_adda/data/network/FCMApis;)V", "sendNotificationToAdmin", "Lcom/techfathers/mechanic_adda/models/FCMSendNotificationResponse;", "sendNotificationBody", "Lcom/techfathers/mechanic_adda/models/SendNotificationBody;", "(Lcom/techfathers/mechanic_adda/models/SendNotificationBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class CommonRepository extends com.techfathers.mechanic_adda.data.network.SafeApiRequest {
    private final com.techfathers.mechanic_adda.data.network.FCMApis fcmApis = null;
    
    public CommonRepository(@org.jetbrains.annotations.NotNull()
    com.techfathers.mechanic_adda.data.network.FCMApis fcmApis) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendNotificationToAdmin(@org.jetbrains.annotations.NotNull()
    com.techfathers.mechanic_adda.models.SendNotificationBody sendNotificationBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.techfathers.mechanic_adda.models.FCMSendNotificationResponse> continuation) {
        return null;
    }
}