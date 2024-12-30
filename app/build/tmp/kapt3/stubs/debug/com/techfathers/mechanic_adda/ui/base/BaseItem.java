package com.techfathers.mechanic_adda.ui.base;

import java.lang.System;

/**
 * Property of Techfathers, Inc @ 2022 All Rights Reserved.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00020\u0004:\u0001\u0014B#\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u00a2\u0006\u0002\u0010\nJ\u001d\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00020\u0006H\u0016\u00a2\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0006H\u0016R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0007\u001a\u00028\u0000\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0015"}, d2 = {"Lcom/techfathers/mechanic_adda/ui/base/BaseItem;", "M", "V", "Landroidx/databinding/ViewDataBinding;", "Lcom/xwray/groupie/databinding/BindableItem;", "layoutResId", "", "model", "callback", "Lcom/techfathers/mechanic_adda/ui/base/BaseItem$OnItemClickListener;", "(ILjava/lang/Object;Lcom/techfathers/mechanic_adda/ui/base/BaseItem$OnItemClickListener;)V", "getModel", "()Ljava/lang/Object;", "Ljava/lang/Object;", "bind", "", "viewBinding", "position", "(Landroidx/databinding/ViewDataBinding;I)V", "getLayout", "OnItemClickListener", "app_debug"})
public final class BaseItem<M extends java.lang.Object, V extends androidx.databinding.ViewDataBinding> extends com.xwray.groupie.databinding.BindableItem<V> {
    private final int layoutResId = 0;
    private final M model = null;
    private final com.techfathers.mechanic_adda.ui.base.BaseItem.OnItemClickListener<M> callback = null;
    
    public BaseItem(int layoutResId, M model, @org.jetbrains.annotations.NotNull()
    com.techfathers.mechanic_adda.ui.base.BaseItem.OnItemClickListener<M> callback) {
        super();
    }
    
    public final M getModel() {
        return null;
    }
    
    @java.lang.Override()
    public int getLayout() {
        return 0;
    }
    
    @java.lang.Override()
    public void bind(@org.jetbrains.annotations.NotNull()
    V viewBinding, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0002\u0010\u00012\u00020\u0002J%\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u00022\u0006\u0010\b\u001a\u00020\tH&\u00a2\u0006\u0002\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/techfathers/mechanic_adda/ui/base/BaseItem$OnItemClickListener;", "M", "", "onItemClick", "", "view", "Landroid/view/View;", "model", "position", "", "(Landroid/view/View;Ljava/lang/Object;I)V", "app_debug"})
    public static abstract interface OnItemClickListener<M extends java.lang.Object> {
        
        public abstract void onItemClick(@org.jetbrains.annotations.NotNull()
        android.view.View view, M model, int position);
    }
}