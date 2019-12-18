package com.example.seven

import android.app.Application
import com.tencent.bugly.crashreport.CrashReport

open class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()
        init()
    }

    fun init() {
        CrashReport.initCrashReport(applicationContext, "9354ef41f1", true)
    }
}