package com.linh.developertiles

import android.app.Application
import timber.log.Timber

class DeveloperTilesApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        initTimber()
    }

    private fun initTimber() {
        val debugTree = Timber.DebugTree()
        Timber.plant(debugTree)
    }
}