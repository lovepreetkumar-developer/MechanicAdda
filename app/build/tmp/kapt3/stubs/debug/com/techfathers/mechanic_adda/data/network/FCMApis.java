package com.techfathers.mechanic_adda.data.network;

import java.lang.System;

/**
 * Property of Techfathers, Inc @ 2022 All Rights Reserved.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/techfathers/mechanic_adda/data/network/FCMApis;", "", "sendNotificationToAdmin", "Lretrofit2/Response;", "Lcom/techfathers/mechanic_adda/models/FCMSendNotificationResponse;", "sendNotificationBody", "Lcom/techfathers/mechanic_adda/models/SendNotificationBody;", "(Lcom/techfathers/mechanic_adda/models/SendNotificationBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public abstract interface FCMApis {
    @org.jetbrains.annotations.NotNull()
    public static final com.techfathers.mechanic_adda.data.network.FCMApis.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "send")
    public abstract java.lang.Object sendNotificationToAdmin(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.techfathers.mechanic_adda.models.SendNotificationBody sendNotificationBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.techfathers.mechanic_adda.models.FCMSendNotificationResponse>> continuation);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0011\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0086\u0002\u00a8\u0006\u0007"}, d2 = {"Lcom/techfathers/mechanic_adda/data/network/FCMApis$Companion;", "", "()V", "invoke", "Lcom/techfathers/mechanic_adda/data/network/FCMApis;", "networkConnectionInterceptor", "Lcom/techfathers/mechanic_adda/data/network/NetworkConnectionInterceptor;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.techfathers.mechanic_adda.data.network.FCMApis invoke(@org.jetbrains.annotations.NotNull()
        com.techfathers.mechanic_adda.data.network.NetworkConnectionInterceptor networkConnectionInterceptor) {
            return null;
        }
    }
}