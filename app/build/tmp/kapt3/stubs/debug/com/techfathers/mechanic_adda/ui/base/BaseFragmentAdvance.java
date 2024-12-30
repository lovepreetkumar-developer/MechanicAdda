package com.techfathers.mechanic_adda.ui.base;

import java.lang.System;

/**
 * Property of Techfathers, Inc @ 2022 All Rights Reserved.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H$J\b\u0010\u0018\u001a\u00020\u0019H\u0014J\b\u0010\u001a\u001a\u00020\u0019H\u0014J\b\u0010\u001b\u001a\u00020\u0019H\u0014J\b\u0010\u001c\u001a\u00020\u0019H\u0004J\u0018\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0014J\u0010\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u0006H\u0016J&\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\u0012\u0010,\u001a\u00020\u00192\b\u0010*\u001a\u0004\u0018\u00010+H\u0015J\b\u0010-\u001a\u00020\u0019H\u0016J\u0012\u0010.\u001a\u00020\u00192\b\u0010/\u001a\u0004\u0018\u000100H\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u0004\u0018\u00018\u0000X\u0084\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\u00028\u0000X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000f\u00a8\u00061"}, d2 = {"Lcom/techfathers/mechanic_adda/ui/base/BaseFragmentAdvance;", "V", "Landroidx/databinding/ViewDataBinding;", "Landroidx/fragment/app/Fragment;", "()V", "baseContext", "Landroid/content/Context;", "getBaseContext", "()Landroid/content/Context;", "setBaseContext", "(Landroid/content/Context;)V", "binding", "getBinding", "()Landroidx/databinding/ViewDataBinding;", "setBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "mainBinding", "getMainBinding", "setMainBinding", "convertUIDirection", "Ljava/util/Locale;", "getFragmentLayout", "", "goBack", "", "goBackAnimation", "goNextAnimation", "goToMainScreen", "loadLocalCircleImage", "path", "", "imageView", "Landroidx/appcompat/widget/AppCompatImageView;", "onAttach", "context", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onFragmentCreateView", "onResume", "setBaseCallback", "baseCallback", "Lcom/techfathers/mechanic_adda/ui/base/BaseCallback;", "app_debug"})
public abstract class BaseFragmentAdvance<V extends androidx.databinding.ViewDataBinding> extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.Nullable()
    private V binding;
    protected V mainBinding;
    @org.jetbrains.annotations.Nullable()
    private android.content.Context baseContext;
    
    public BaseFragmentAdvance() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final V getBinding() {
        return null;
    }
    
    protected final void setBinding(@org.jetbrains.annotations.Nullable()
    V p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final V getMainBinding() {
        return null;
    }
    
    protected final void setMainBinding(@org.jetbrains.annotations.NotNull()
    V p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final android.content.Context getBaseContext() {
        return null;
    }
    
    protected final void setBaseContext(@org.jetbrains.annotations.Nullable()
    android.content.Context p0) {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    protected void setBaseCallback(@org.jetbrains.annotations.Nullable()
    com.techfathers.mechanic_adda.ui.base.BaseCallback baseCallback) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @androidx.annotation.CallSuper()
    protected void onFragmentCreateView(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    protected abstract int getFragmentLayout();
    
    protected void goBack() {
    }
    
    protected void goNextAnimation() {
    }
    
    protected void goBackAnimation() {
    }
    
    protected void loadLocalCircleImage(@org.jetbrains.annotations.NotNull()
    java.lang.String path, @org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatImageView imageView) {
    }
    
    protected final void goToMainScreen() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.util.Locale convertUIDirection() {
        return null;
    }
}