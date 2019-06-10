package com.haman.mybooksy

import android.app.Application
import com.haman.mybooksy.manager.SessionManager

class App: Application() {

    companion object {
        lateinit var sessionManager: SessionManager

    }

    override fun onCreate() {
        super.onCreate()
        sessionManager = SessionManager(context = applicationContext)
    }

}