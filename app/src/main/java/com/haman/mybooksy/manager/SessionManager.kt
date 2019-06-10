package com.haman.mybooksy.manager

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager

class SessionManager(context: Context) {

    private val SP_TYPE_SERVICE = "sp_type_service"
    private val sp: SharedPreferences = PreferenceManager.getDefaultSharedPreferences(context)

    fun setTypeServices(type: TypeServices) {
        sp.edit().putInt(SP_TYPE_SERVICE, type.ordinal).apply()
    }

    fun getTypeServices(): Int = sp.getInt(SP_TYPE_SERVICE, -1)

    enum class TypeServices(type: Int) {
        WOMEN(0),
        MEN(1),
        BOTH(2)
    }
}