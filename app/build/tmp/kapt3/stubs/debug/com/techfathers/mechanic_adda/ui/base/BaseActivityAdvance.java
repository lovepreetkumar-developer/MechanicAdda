package com.techfathers.mechanic_adda.ui.base;

import java.lang.System;

/**
 * Property of Techfathers, Inc @ 2022 All Rights Reserved.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0018\u001a\u00020\u0019H\u0014J\b\u0010\u001a\u001a\u00020\u001bH&J\b\u0010\u001c\u001a\u00020\u0019H\u0014J\b\u0010\u001d\u001a\u00020\u0019H\u0014J\b\u0010\u001e\u001a\u00020\u0019H\u0014J\b\u0010\u001f\u001a\u00020\u0019H\u0014J\b\u0010 \u001a\u00020\u0019H\u0014J\b\u0010!\u001a\u00020\u0019H\u0016J\u0012\u0010\"\u001a\u00020\u00192\b\u0010#\u001a\u0004\u0018\u00010$H\u0014J\u001c\u0010%\u001a\u00020\u00192\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0017J\u0012\u0010(\u001a\u00020\u00192\b\u0010)\u001a\u0004\u0018\u00010*H\u0014R\u001c\u0010\u0006\u001a\u00028\u0000X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006+"}, d2 = {"Lcom/techfathers/mechanic_adda/ui/base/BaseActivityAdvance;", "V", "Landroidx/databinding/ViewDataBinding;", "Landroidx/appcompat/app/AppCompatActivity;", "Lorg/kodein/di/KodeinAware;", "()V", "binding", "getBinding", "()Landroidx/databinding/ViewDataBinding;", "setBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "mPrefProvider", "Lcom/techfathers/mechanic_adda/data/preferences/PreferenceProvider;", "getMPrefProvider", "()Lcom/techfathers/mechanic_adda/data/preferences/PreferenceProvider;", "mPrefProvider$delegate", "Lkotlin/Lazy;", "finishActivityWithBackAnim", "", "getContentView", "", "goBack", "goBackAnimation", "goNextAnimation", "goNextSwipeAnimation", "goToHomeScreen", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onViewReady", "intent", "Landroid/content/Intent;", "setBaseCallback", "baseCallback", "Lcom/techfathers/mechanic_adda/ui/base/BaseCallback;", "app_debug"})
public abstract class BaseActivityAdvance<V extends androidx.databinding.ViewDataBinding> extends androidx.appcompat.app.AppCompatActivity implements org.kodein.di.KodeinAware {
    protected V binding;
    @org.jetbrains.annotations.Nullable()
    private android.content.Context context;
    private final kotlin.Lazy mPrefProvider$delegate = null;
    
    public BaseActivityAdvance() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final V getBinding() {
        return null;
    }
    
    protected final void setBinding(@org.jetbrains.annotations.NotNull()
    V p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final android.content.Context getContext() {
        return null;
    }
    
    protected final void setContext(@org.jetbrains.annotations.Nullable()
    android.content.Context p0) {
    }
    
    private final com.techfathers.mechanic_adda.data.preferences.PreferenceProvider getMPrefProvider() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    protected void setBaseCallback(@org.jetbrains.annotations.Nullable()
    com.techfathers.mechanic_adda.ui.base.BaseCallback baseCallback) {
    }
    
    @androidx.annotation.CallSuper()
    public void onViewReady(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState, @org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
    }
    
    public abstract int getContentView();
    
    protected void goToHomeScreen() {
    }
    
    protected void goBack() {
    }
    
    protected void finishActivityWithBackAnim() {
    }
    
    protected void goNextAnimation() {
    }
    
    protected void goNextSwipeAnimation() {
    }
    
    protected void goBackAnimation() {
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