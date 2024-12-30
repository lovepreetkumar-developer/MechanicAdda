package com.techfathers.mechanic_adda.ui.fragments;

import java.lang.System;

/**
 * Property of Techfathers, Inc @ 2022 All Rights Reserved.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020 H\u0014J\b\u0010!\u001a\u00020\u001eH\u0002J\b\u0010\"\u001a\u00020\u001eH\u0002J\u0012\u0010#\u001a\u00020\u001e2\b\u0010$\u001a\u0004\u0018\u00010%H\u0014J\b\u0010&\u001a\u00020\u001eH\u0002J\b\u0010\'\u001a\u00020\u001eH\u0002J$\u0010(\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0*0)*\b\u0012\u0004\u0012\u00020+0)H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\f\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lcom/techfathers/mechanic_adda/ui/fragments/AllRequestsFragment;", "Lcom/techfathers/mechanic_adda/ui/base/BaseFragment;", "Lcom/techfathers/mechanic_adda/databinding/FragmentAllRequestsBinding;", "Lorg/kodein/di/KodeinAware;", "()V", "baseCallback", "Lcom/techfathers/mechanic_adda/ui/base/BaseCallback;", "kodein", "Lorg/kodein/di/Kodein;", "getKodein", "()Lorg/kodein/di/Kodein;", "kodein$delegate", "Lkotlin/Lazy;", "mLogoutWarningDialog", "Lcom/techfathers/mechanic_adda/ui/base/BaseCustomDialog;", "Lcom/techfathers/mechanic_adda/databinding/DialogAlertBinding;", "mPrefProvider", "Lcom/techfathers/mechanic_adda/data/preferences/PreferenceProvider;", "getMPrefProvider", "()Lcom/techfathers/mechanic_adda/data/preferences/PreferenceProvider;", "mPrefProvider$delegate", "mProgressView", "Lcom/techfathers/mechanic_adda/ui/custom_views/circle_progress/CustomProgress;", "getMProgressView", "()Lcom/techfathers/mechanic_adda/ui/custom_views/circle_progress/CustomProgress;", "mProgressView$delegate", "mRequestsAdapter", "Lcom/xwray/groupie/GroupAdapter;", "Lcom/xwray/groupie/GroupieViewHolder;", "getAllRequests", "", "getFragmentLayout", "", "initView", "noRequestFound", "onFragmentCreateView", "savedInstanceState", "Landroid/os/Bundle;", "requestFound", "showAlertDialog", "toBookedRequestItems", "", "Lcom/techfathers/mechanic_adda/ui/base/BaseItem;", "Lcom/techfathers/mechanic_adda/models/RequestModel;", "Lcom/techfathers/mechanic_adda/databinding/ItemBookedRequestBinding;", "app_debug"})
public final class AllRequestsFragment extends com.techfathers.mechanic_adda.ui.base.BaseFragment<com.techfathers.mechanic_adda.databinding.FragmentAllRequestsBinding> implements org.kodein.di.KodeinAware {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy kodein$delegate = null;
    private final kotlin.Lazy mPrefProvider$delegate = null;
    private final kotlin.Lazy mProgressView$delegate = null;
    private com.xwray.groupie.GroupAdapter<com.xwray.groupie.GroupieViewHolder> mRequestsAdapter;
    private com.techfathers.mechanic_adda.ui.base.BaseCustomDialog<com.techfathers.mechanic_adda.databinding.DialogAlertBinding> mLogoutWarningDialog;
    private final com.techfathers.mechanic_adda.ui.base.BaseCallback baseCallback = null;
    
    public AllRequestsFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.kodein.di.Kodein getKodein() {
        return null;
    }
    
    private final com.techfathers.mechanic_adda.data.preferences.PreferenceProvider getMPrefProvider() {
        return null;
    }
    
    private final com.techfathers.mechanic_adda.ui.custom_views.circle_progress.CustomProgress getMProgressView() {
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
    
    private final void getAllRequests() {
    }
    
    private final void noRequestFound() {
    }
    
    private final void requestFound() {
    }
    
    private final java.util.List<com.techfathers.mechanic_adda.ui.base.BaseItem<com.techfathers.mechanic_adda.models.RequestModel, com.techfathers.mechanic_adda.databinding.ItemBookedRequestBinding>> toBookedRequestItems(java.util.List<com.techfathers.mechanic_adda.models.RequestModel> $this$toBookedRequestItems) {
        return null;
    }
    
    private final void showAlertDialog() {
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