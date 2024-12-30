package com.techfathers.mechanic_adda.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u001a\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\u001a\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r\u001a\u000e\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\u001a\n\u0010\u000f\u001a\u00020\u0010*\u00020\u0011\u001a\u0012\u0010\u0012\u001a\u00020\u0013*\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015\u001a\n\u0010\u0016\u001a\u00020\u0015*\u00020\r\u001a\u0012\u0010\u0007\u001a\u00020\b*\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0018\u001a\n\u0010\u0019\u001a\u00020\b*\u00020\n\u001a\n\u0010\u001a\u001a\u00020\b*\u00020\r\u001a\u001a\u0010\u001b\u001a\u00020\b*\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0013\u001a\u0012\u0010\u001d\u001a\u00020\b*\u00020\n2\u0006\u0010\u001e\u001a\u00020\u0011\u001a\u0012\u0010\u001f\u001a\u00020\b*\u00020\r2\u0006\u0010 \u001a\u00020\u0015\u001a\u0012\u0010!\u001a\u00020\b*\u00020\u00182\u0006\u0010 \u001a\u00020\u0015\u001a\n\u0010\"\u001a\u00020\b*\u00020\n\u001a\u0012\u0010#\u001a\u00020\b*\u00020\r2\u0006\u0010 \u001a\u00020\u0015\u001a\n\u0010$\u001a\u00020\b*\u00020\n\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0016\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"inputMethodManager", "Landroid/view/inputmethod/InputMethodManager;", "messageDialog", "Lcom/techfathers/mechanic_adda/ui/base/BaseCustomDialog;", "Lcom/techfathers/mechanic_adda/databinding/DialogMessageBinding;", "getDatabaseReference", "Lcom/google/firebase/database/DatabaseReference;", "hideSoftKeyboard", "", "activity", "Landroid/app/Activity;", "shareApplication", "context", "Landroid/content/Context;", "showSoftKeyboard", "dpToPx", "", "", "getBooleanValueFromSharePreference", "", "key", "", "getPlayStoreAppLink", "view", "Landroid/view/View;", "hideStatusBar", "openPlayStore", "setBooleanValueFromSharePreference", "value", "setStatusBarColor", "color", "showMessageDialog", "message", "showSnackBar", "showStatusBar", "showToast", "statusBarWork", "app_debug"})
public final class ExtensionsKt {
    private static android.view.inputmethod.InputMethodManager inputMethodManager;
    private static com.techfathers.mechanic_adda.ui.base.BaseCustomDialog<com.techfathers.mechanic_adda.databinding.DialogMessageBinding> messageDialog;
    
    /**
     * Property of Techfathers, Inc @ 2022 All Rights Reserved.
     */
    public static final void showToast(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$showToast, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public static final float dpToPx(int $this$dpToPx) {
        return 0.0F;
    }
    
    public static final void showSnackBar(@org.jetbrains.annotations.NotNull()
    android.view.View $this$showSnackBar, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getPlayStoreAppLink(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$getPlayStoreAppLink) {
        return null;
    }
    
    public static final void openPlayStore(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$openPlayStore) {
    }
    
    @kotlin.Suppress(names = {"DEPRECATION"})
    public static final void hideStatusBar(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$hideStatusBar) {
    }
    
    @kotlin.Suppress(names = {"DEPRECATION"})
    public static final void showStatusBar(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$showStatusBar) {
    }
    
    public static final void hideSoftKeyboard(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    public static final void showSoftKeyboard(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    public static final void shareApplication(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public static final void statusBarWork(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$statusBarWork) {
    }
    
    public static final void setStatusBarColor(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$setStatusBarColor, int color) {
    }
    
    public static final void setBooleanValueFromSharePreference(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$setBooleanValueFromSharePreference, @org.jetbrains.annotations.NotNull()
    java.lang.String key, boolean value) {
    }
    
    public static final boolean getBooleanValueFromSharePreference(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$getBooleanValueFromSharePreference, @org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.google.firebase.database.DatabaseReference getDatabaseReference() {
        return null;
    }
    
    public static final void showMessageDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$showMessageDialog, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public static final void hideSoftKeyboard(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$hideSoftKeyboard, @org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
}