package com.techfathers.mechanic_adda.data.preferences

import android.content.Context
import android.content.SharedPreferences
import androidx.preference.PreferenceManager
import com.google.gson.Gson
import com.techfathers.mechanic_adda.util.Constants


class PreferenceProvider(context: Context) {

    private val appContext = context.applicationContext

    private val preferences: SharedPreferences
        get() = PreferenceManager.getDefaultSharedPreferences(appContext)

    fun clear(): Boolean {
        return preferences.edit().clear().commit()
    }

    fun setAdminLoggedIn(value: Boolean) {
        return preferences.edit().putBoolean(
            Constants.ADMIN_LOGGED_IN,
            value
        ).apply()
    }

    fun isAdminLoggedIn(): Boolean {
        return preferences.getBoolean(Constants.ADMIN_LOGGED_IN, false)
    }

    fun setFirebaseToken(tokenValue: String) {
        return preferences.edit().putString(
            Constants.FIREBASE_TOKEN,
            tokenValue
        ).apply()
    }

    fun getFirebaseToken(): String? {
        return preferences.getString(Constants.FIREBASE_TOKEN, null)
    }
}