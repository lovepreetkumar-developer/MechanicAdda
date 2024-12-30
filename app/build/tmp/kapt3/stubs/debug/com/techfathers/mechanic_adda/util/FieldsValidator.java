package com.techfathers.mechanic_adda.util;

import java.lang.System;

/**
 * Property of Techfathers, Inc @ 2022 All Rights Reserved.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020 2\b\u0010$\u001a\u0004\u0018\u00010\u0004J\u000e\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020%J\u000e\u0010&\u001a\u00020\"2\u0006\u0010#\u001a\u00020\'J\u000e\u0010&\u001a\u00020\"2\u0006\u0010(\u001a\u00020)J*\u0010*\u001a\u00020\"2\u0006\u0010#\u001a\u00020 2\b\u0010+\u001a\u0004\u0018\u00010\u00042\b\u0010$\u001a\u0004\u0018\u00010\u00042\u0006\u0010,\u001a\u00020\"J*\u0010-\u001a\u00020\"2\u0006\u0010#\u001a\u00020 2\b\u0010+\u001a\u0004\u0018\u00010\u00042\b\u0010$\u001a\u0004\u0018\u00010\u00042\u0006\u0010,\u001a\u00020\"J\u0018\u0010.\u001a\u00020\"2\b\u0010/\u001a\u0004\u0018\u0001002\u0006\u00101\u001a\u000202J\u0016\u00103\u001a\u00020\"2\u0006\u0010#\u001a\u00020 2\u0006\u0010,\u001a\u00020\"J\u0016\u00104\u001a\u00020\"2\u0006\u0010#\u001a\u00020 2\u0006\u0010,\u001a\u00020\"J\u0016\u00105\u001a\u00020\"2\u0006\u00106\u001a\u00020 2\u0006\u00107\u001a\u00020 J\u0016\u00108\u001a\u00020\"2\u0006\u0010#\u001a\u00020 2\u0006\u0010,\u001a\u00020\"J\u0016\u00109\u001a\u00020\"2\u0006\u0010#\u001a\u00020 2\u0006\u0010,\u001a\u00020\"J(\u0010:\u001a\u00020\"2\u0006\u0010#\u001a\u00020 2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020<2\b\u0010>\u001a\u0004\u0018\u00010\u0004J*\u0010?\u001a\u00020\"2\u0006\u0010#\u001a\u00020 2\b\u0010+\u001a\u0004\u0018\u00010\u00042\b\u0010$\u001a\u0004\u0018\u00010\u00042\u0006\u0010,\u001a\u00020\"J\u0016\u0010@\u001a\u00020\"2\u0006\u0010#\u001a\u00020 2\u0006\u0010,\u001a\u00020\"J \u0010A\u001a\u00020\"2\u0006\u0010#\u001a\u00020 2\b\u0010+\u001a\u0004\u0018\u00010\u00042\u0006\u0010,\u001a\u00020\"J\u0018\u0010B\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020 2\b\u0010C\u001a\u0004\u0018\u00010\u0004J\u0018\u0010D\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020E2\b\u0010C\u001a\u0004\u0018\u00010\u0004J(\u0010F\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010G\u001a\u00020<2\u0006\u0010H\u001a\u00020<2\b\u0010C\u001a\u0004\u0018\u00010\u0004J(\u0010F\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020%2\u0006\u0010G\u001a\u00020<2\u0006\u0010H\u001a\u00020<2\b\u0010C\u001a\u0004\u0018\u00010\u0004J\u0018\u0010I\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020 2\b\u0010C\u001a\u0004\u0018\u00010\u0004J\u0018\u0010I\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020%2\b\u0010C\u001a\u0004\u0018\u00010\u0004J \u0010J\u001a\u00020\"2\u0006\u0010K\u001a\u00020 2\u0006\u0010L\u001a\u00020 2\b\u0010C\u001a\u0004\u0018\u00010\u0004J\u0018\u0010M\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020 2\b\u0010C\u001a\u0004\u0018\u00010\u0004J\u0018\u0010N\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020 2\b\u0010C\u001a\u0004\u0018\u00010\u0004J\u0018\u0010O\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020 2\b\u0010C\u001a\u0004\u0018\u00010\u0004J \u0010P\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010Q\u001a\u00020R2\b\u0010C\u001a\u0004\u0018\u00010\u0004J\u0018\u0010S\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020 2\b\u0010C\u001a\u0004\u0018\u00010\u0004R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0006\u00a8\u0006T"}, d2 = {"Lcom/techfathers/mechanic_adda/util/FieldsValidator;", "", "()V", "AT_LEAST_ONE_DIGIT_AND_UPPER_ALPHA_REGEX", "", "getAT_LEAST_ONE_DIGIT_AND_UPPER_ALPHA_REGEX", "()Ljava/lang/String;", "AT_LEAST_ONE_SYMBOL_AND_UPPER_ALPHA_REGEX", "getAT_LEAST_ONE_SYMBOL_AND_UPPER_ALPHA_REGEX", "EMAIL_MSG", "getEMAIL_MSG", "EMAIL_REGEX", "getEMAIL_REGEX", "INTEGERS_REGEX", "getINTEGERS_REGEX", "PASSWORD_MSG", "getPASSWORD_MSG", "PASSWORD_REGEX", "getPASSWORD_REGEX", "PASSWORD_REGEX_NEW", "getPASSWORD_REGEX_NEW", "PHONE_MSG", "getPHONE_MSG", "PHONE_REGEX", "getPHONE_REGEX", "REQUIRED_MSG", "getREQUIRED_MSG", "TEXT_LIMIT", "getTEXT_LIMIT", "clearError", "", "view", "Landroid/widget/EditText;", "hasText", "", "editText", "errMsg", "Landroid/widget/TextView;", "hasTextWithoutError", "Landroidx/appcompat/widget/AppCompatEditText;", "textView", "Landroidx/appcompat/widget/AppCompatTextView;", "haveAtLeastOneDigitAndUpperAlpha", "regex", "required", "haveAtLeastOneSymbolAndUpperAlpha", "isChecked", "context", "Landroid/content/Context;", "checkBox", "Landroid/widget/CheckBox;", "isEmailAddress", "isEmailAddressWithoutErrorMessage", "isMatching", "editText1", "editText2", "isOnlyIntegersWithoutErrorMessage", "isPhoneNumber", "isTextWithInRange", "minLimit", "", "maxLimit", "error", "isValid", "isValidPassword", "isValidWithoutErrorMessage", "validateEmail", "message", "validateGender", "Landroid/widget/Spinner;", "validateLength", "minLength", "maxLength", "validateNotEmpty", "validatePasswordMatch", "password", "confirmPassword", "validatePhoneNumberSpace", "validateUsernameSpace", "validateUsernameWithoutSpace", "validateValidCharacters", "pattern", "Ljava/util/regex/Pattern;", "validatedateofbirth", "app_debug"})
public final class FieldsValidator {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String EMAIL_REGEX = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String INTEGERS_REGEX = ".*\\d.*";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String PHONE_REGEX = "\\d{3}-\\d{7}";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String PASSWORD_REGEX = "^(?=.*[a-zA-Z])(?=.*\\d)(?=.*[!@#$%^&*()_+])[A-Za-z\\d][A-Za-z\\d!@#$%^&*()_+]{7,19}$";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String PASSWORD_REGEX_NEW = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9]).{6,}$";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String AT_LEAST_ONE_DIGIT_AND_UPPER_ALPHA_REGEX = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{6,20}$";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String AT_LEAST_ONE_SYMBOL_AND_UPPER_ALPHA_REGEX = "^(?=.*[$@$!%*#?&])(?=.*[a-z])(?=.*[A-Z]).{6,20}$";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String REQUIRED_MSG = "Required";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String EMAIL_MSG = "Email address is required and in correct format";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String PHONE_MSG = "##########";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String PASSWORD_MSG = "Password must be of 9 character and include atleast one small and one capital letter and number";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TEXT_LIMIT = "Nickname cannot be greater than 18";
    
    public FieldsValidator() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEMAIL_REGEX() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getINTEGERS_REGEX() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPHONE_REGEX() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPASSWORD_REGEX() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPASSWORD_REGEX_NEW() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAT_LEAST_ONE_DIGIT_AND_UPPER_ALPHA_REGEX() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAT_LEAST_ONE_SYMBOL_AND_UPPER_ALPHA_REGEX() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getREQUIRED_MSG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEMAIL_MSG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPHONE_MSG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPASSWORD_MSG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTEXT_LIMIT() {
        return null;
    }
    
    public final boolean isEmailAddress(@org.jetbrains.annotations.NotNull()
    android.widget.EditText editText, boolean required) {
        return false;
    }
    
    public final boolean isEmailAddressWithoutErrorMessage(@org.jetbrains.annotations.NotNull()
    android.widget.EditText editText, boolean required) {
        return false;
    }
    
    public final boolean isOnlyIntegersWithoutErrorMessage(@org.jetbrains.annotations.NotNull()
    android.widget.EditText editText, boolean required) {
        return false;
    }
    
    public final boolean isValidPassword(@org.jetbrains.annotations.NotNull()
    android.widget.EditText editText, boolean required) {
        return false;
    }
    
    public final boolean isPhoneNumber(@org.jetbrains.annotations.NotNull()
    android.widget.EditText editText, boolean required) {
        return false;
    }
    
    public final boolean isValid(@org.jetbrains.annotations.NotNull()
    android.widget.EditText editText, @org.jetbrains.annotations.Nullable()
    java.lang.String regex, @org.jetbrains.annotations.Nullable()
    java.lang.String errMsg, boolean required) {
        return false;
    }
    
    public final boolean isValidWithoutErrorMessage(@org.jetbrains.annotations.NotNull()
    android.widget.EditText editText, @org.jetbrains.annotations.Nullable()
    java.lang.String regex, boolean required) {
        return false;
    }
    
    public final boolean hasText(@org.jetbrains.annotations.NotNull()
    android.widget.TextView editText) {
        return false;
    }
    
    public final boolean isChecked(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.widget.CheckBox checkBox) {
        return false;
    }
    
    public final boolean hasText(@org.jetbrains.annotations.NotNull()
    android.widget.EditText editText, @org.jetbrains.annotations.Nullable()
    java.lang.String errMsg) {
        return false;
    }
    
    public final boolean hasTextWithoutError(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatTextView textView) {
        return false;
    }
    
    public final boolean hasTextWithoutError(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatEditText editText) {
        return false;
    }
    
    public final boolean isTextWithInRange(@org.jetbrains.annotations.NotNull()
    android.widget.EditText editText, int minLimit, int maxLimit, @org.jetbrains.annotations.Nullable()
    java.lang.String error) {
        return false;
    }
    
    public final boolean isMatching(@org.jetbrains.annotations.NotNull()
    android.widget.EditText editText1, @org.jetbrains.annotations.NotNull()
    android.widget.EditText editText2) {
        return false;
    }
    
    public final boolean haveAtLeastOneDigitAndUpperAlpha(@org.jetbrains.annotations.NotNull()
    android.widget.EditText editText, @org.jetbrains.annotations.Nullable()
    java.lang.String regex, @org.jetbrains.annotations.Nullable()
    java.lang.String errMsg, boolean required) {
        return false;
    }
    
    public final boolean haveAtLeastOneSymbolAndUpperAlpha(@org.jetbrains.annotations.NotNull()
    android.widget.EditText editText, @org.jetbrains.annotations.Nullable()
    java.lang.String regex, @org.jetbrains.annotations.Nullable()
    java.lang.String errMsg, boolean required) {
        return false;
    }
    
    @kotlin.jvm.Synchronized()
    private final synchronized void clearError(android.widget.EditText view) {
    }
    
    @kotlin.jvm.Synchronized()
    public final synchronized boolean validateEmail(@org.jetbrains.annotations.NotNull()
    android.widget.EditText view, @org.jetbrains.annotations.Nullable()
    java.lang.String message) {
        return false;
    }
    
    @kotlin.jvm.Synchronized()
    public final synchronized boolean validateNotEmpty(@org.jetbrains.annotations.NotNull()
    android.widget.TextView view, @org.jetbrains.annotations.Nullable()
    java.lang.String message) {
        return false;
    }
    
    @kotlin.jvm.Synchronized()
    public final synchronized boolean validateNotEmpty(@org.jetbrains.annotations.NotNull()
    android.widget.EditText view, @org.jetbrains.annotations.Nullable()
    java.lang.String message) {
        return false;
    }
    
    @kotlin.jvm.Synchronized()
    public final synchronized boolean validateLength(@org.jetbrains.annotations.NotNull()
    android.widget.EditText view, int minLength, int maxLength, @org.jetbrains.annotations.Nullable()
    java.lang.String message) {
        return false;
    }
    
    @kotlin.jvm.Synchronized()
    public final synchronized boolean validateLength(@org.jetbrains.annotations.NotNull()
    android.widget.TextView view, int minLength, int maxLength, @org.jetbrains.annotations.Nullable()
    java.lang.String message) {
        return false;
    }
    
    @kotlin.jvm.Synchronized()
    public final synchronized boolean validateValidCharacters(@org.jetbrains.annotations.NotNull()
    android.widget.EditText view, @org.jetbrains.annotations.NotNull()
    java.util.regex.Pattern pattern, @org.jetbrains.annotations.Nullable()
    java.lang.String message) {
        return false;
    }
    
    @kotlin.jvm.Synchronized()
    public final synchronized boolean validateUsernameWithoutSpace(@org.jetbrains.annotations.NotNull()
    android.widget.EditText view, @org.jetbrains.annotations.Nullable()
    java.lang.String message) {
        return false;
    }
    
    @kotlin.jvm.Synchronized()
    public final synchronized boolean validateUsernameSpace(@org.jetbrains.annotations.NotNull()
    android.widget.EditText view, @org.jetbrains.annotations.Nullable()
    java.lang.String message) {
        return false;
    }
    
    @kotlin.jvm.Synchronized()
    public final synchronized boolean validatedateofbirth(@org.jetbrains.annotations.NotNull()
    android.widget.EditText view, @org.jetbrains.annotations.Nullable()
    java.lang.String message) {
        return false;
    }
    
    @kotlin.jvm.Synchronized()
    public final synchronized boolean validateGender(@org.jetbrains.annotations.NotNull()
    android.widget.Spinner view, @org.jetbrains.annotations.Nullable()
    java.lang.String message) {
        return false;
    }
    
    @kotlin.jvm.Synchronized()
    public final synchronized boolean validatePhoneNumberSpace(@org.jetbrains.annotations.NotNull()
    android.widget.EditText view, @org.jetbrains.annotations.Nullable()
    java.lang.String message) {
        return false;
    }
    
    @kotlin.jvm.Synchronized()
    public final synchronized boolean validatePasswordMatch(@org.jetbrains.annotations.NotNull()
    android.widget.EditText password, @org.jetbrains.annotations.NotNull()
    android.widget.EditText confirmPassword, @org.jetbrains.annotations.Nullable()
    java.lang.String message) {
        return false;
    }
}