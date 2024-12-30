package com.techfathers.mechanic_adda.ui.fragments;

import java.lang.System;

/**
 * Property of Techfathers, Inc @ 2022 All Rights Reserved.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020\'H\u0014J\b\u0010(\u001a\u00020#H\u0002J\u0012\u0010)\u001a\u00020#2\b\u0010*\u001a\u0004\u0018\u00010+H\u0014J\u0018\u0010,\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010-\u001a\u00020.H\u0002J\b\u0010/\u001a\u00020#H\u0002J\b\u00100\u001a\u000201H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\f\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00062"}, d2 = {"Lcom/techfathers/mechanic_adda/ui/fragments/BookRequestFragment;", "Lcom/techfathers/mechanic_adda/ui/base/BaseFragment;", "Lcom/techfathers/mechanic_adda/databinding/FragmentBookRequestBinding;", "Lorg/kodein/di/KodeinAware;", "()V", "baseCallback", "Lcom/techfathers/mechanic_adda/ui/base/BaseCallback;", "kodein", "Lorg/kodein/di/Kodein;", "getKodein", "()Lorg/kodein/di/Kodein;", "kodein$delegate", "Lkotlin/Lazy;", "mFactory", "Lcom/techfathers/mechanic_adda/vm_factories/HomeViewModelFactory;", "getMFactory", "()Lcom/techfathers/mechanic_adda/vm_factories/HomeViewModelFactory;", "mFactory$delegate", "mFieldValidator", "Lcom/techfathers/mechanic_adda/util/FieldsValidator;", "getMFieldValidator", "()Lcom/techfathers/mechanic_adda/util/FieldsValidator;", "mFieldValidator$delegate", "mHomeViewModel", "Lcom/techfathers/mechanic_adda/view_models/HomeViewModel;", "mProgressView", "Lcom/techfathers/mechanic_adda/ui/custom_views/circle_progress/CustomProgress;", "getMProgressView", "()Lcom/techfathers/mechanic_adda/ui/custom_views/circle_progress/CustomProgress;", "mProgressView$delegate", "mRequestType", "", "mServiceModel", "Lcom/techfathers/mechanic_adda/models/ServiceModel;", "getAdminFirebaseToken", "", "requestModel", "Lcom/techfathers/mechanic_adda/models/RequestModel;", "getFragmentLayout", "", "initView", "onFragmentCreateView", "savedInstanceState", "Landroid/os/Bundle;", "sendNotificationToAdmin", "adminModel", "Lcom/techfathers/mechanic_adda/models/AdminModel;", "submitRequest", "validateFields", "", "app_debug"})
public final class BookRequestFragment extends com.techfathers.mechanic_adda.ui.base.BaseFragment<com.techfathers.mechanic_adda.databinding.FragmentBookRequestBinding> implements org.kodein.di.KodeinAware {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy kodein$delegate = null;
    private final kotlin.Lazy mProgressView$delegate = null;
    private final kotlin.Lazy mFieldValidator$delegate = null;
    private final kotlin.Lazy mFactory$delegate = null;
    private com.techfathers.mechanic_adda.view_models.HomeViewModel mHomeViewModel;
    private com.techfathers.mechanic_adda.models.ServiceModel mServiceModel;
    private java.lang.String mRequestType;
    private final com.techfathers.mechanic_adda.ui.base.BaseCallback baseCallback = null;
    
    public BookRequestFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.kodein.di.Kodein getKodein() {
        return null;
    }
    
    private final com.techfathers.mechanic_adda.ui.custom_views.circle_progress.CustomProgress getMProgressView() {
        return null;
    }
    
    private final com.techfathers.mechanic_adda.util.FieldsValidator getMFieldValidator() {
        return null;
    }
    
    private final com.techfathers.mechanic_adda.vm_factories.HomeViewModelFactory getMFactory() {
        return null;
    }
    
    @java.lang.Override()
    protected int getFragmentLayout() {
        return 0;
    }
    
    @java.lang.Override()
    protected void onFragmentCreateView(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initView() {
    }
    
    private final boolean validateFields() {
        return false;
    }
    
    private final void submitRequest() {
    }
    
    private final void getAdminFirebaseToken(com.techfathers.mechanic_adda.models.RequestModel requestModel) {
    }
    
    private final void sendNotificationToAdmin(com.techfathers.mechanic_adda.models.RequestModel requestModel, com.techfathers.mechanic_adda.models.AdminModel adminModel) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.kodein.di.KodeinContext<?> getKodeinContext() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public org.kodein.di.KodeinTrigger getKodeinTrigger() {
        return null;
    }
}