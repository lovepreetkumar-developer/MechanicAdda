package com.techfathers.mechanic_adda.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007JP\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J0\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u0012H\u0016R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/techfathers/mechanic_adda/util/ScrollingFABBehavior;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mHandler", "Landroid/os/Handler;", "onNestedScroll", "", "coordinatorLayout", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "child", "target", "Landroid/view/View;", "dxConsumed", "", "dyConsumed", "dxUnconsumed", "dyUnconsumed", "type", "consumed", "", "onStartNestedScroll", "", "directTargetChild", "nestedScrollAxes", "app_debug"})
public final class ScrollingFABBehavior extends androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior<android.widget.RelativeLayout> {
    private final android.os.Handler mHandler = null;
    
    public ScrollingFABBehavior(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super();
    }
    
    @java.lang.Override()
    public void onNestedScroll(@org.jetbrains.annotations.NotNull()
    androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, @org.jetbrains.annotations.NotNull()
    android.widget.RelativeLayout child, @org.jetbrains.annotations.NotNull()
    android.view.View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type, @org.jetbrains.annotations.NotNull()
    int[] consumed) {
    }
    
    @java.lang.Override()
    public boolean onStartNestedScroll(@org.jetbrains.annotations.NotNull()
    androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, @org.jetbrains.annotations.NotNull()
    android.widget.RelativeLayout child, @org.jetbrains.annotations.NotNull()
    android.view.View directTargetChild, @org.jetbrains.annotations.NotNull()
    android.view.View target, int nestedScrollAxes) {
        return false;
    }
}