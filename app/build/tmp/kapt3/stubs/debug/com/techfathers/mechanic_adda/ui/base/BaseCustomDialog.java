package com.techfathers.mechanic_adda.ui.base;

import java.lang.System;

/**
 * Property of Techfathers, Inc @ 2022 All Rights Reserved.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0001\u0015B!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u000bJ\u000b\u0010\u000e\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u0012\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014R\u0012\u0010\f\u001a\u0004\u0018\u00018\u0000X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\rR\u0012\u0010\u0006\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/techfathers/mechanic_adda/ui/base/BaseCustomDialog;", "V", "Landroidx/databinding/ViewDataBinding;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "layoutId", "", "listener", "Lcom/techfathers/mechanic_adda/ui/base/BaseCustomDialog$DialogListener;", "(Landroid/content/Context;ILcom/techfathers/mechanic_adda/ui/base/BaseCustomDialog$DialogListener;)V", "(Landroid/content/Context;)V", "binding", "Landroidx/databinding/ViewDataBinding;", "getBinding", "()Landroidx/databinding/ViewDataBinding;", "init", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "DialogListener", "app_debug"})
public final class BaseCustomDialog<V extends androidx.databinding.ViewDataBinding> extends android.app.Dialog {
    private V binding;
    @androidx.annotation.LayoutRes()
    private int layoutId = 0;
    private com.techfathers.mechanic_adda.ui.base.BaseCustomDialog.DialogListener listener;
    
    public BaseCustomDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public BaseCustomDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @androidx.annotation.LayoutRes()
    int layoutId, @org.jetbrains.annotations.NotNull()
    com.techfathers.mechanic_adda.ui.base.BaseCustomDialog.DialogListener listener) {
        super(null);
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final V getBinding() {
        return null;
    }
    
    private final void init() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/techfathers/mechanic_adda/ui/base/BaseCustomDialog$DialogListener;", "", "onViewClick", "", "view", "Landroid/view/View;", "app_debug"})
    public static abstract interface DialogListener {
        
        public abstract void onViewClick(@org.jetbrains.annotations.Nullable()
        android.view.View view);
    }
}