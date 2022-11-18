package com.vanik.accountapp

import android.app.Application
import com.vanik.accountapp.di.appModules
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.logger.Level

class FirebaseApp :Application(){
    override fun onCreate() {
        super.onCreate()
        startKoin()
    }

    private fun startKoin() = org.koin.core.context.startKoin {
        androidLogger(Level.DEBUG)
        androidContext(this@FirebaseApp)
        modules(appModules)
    }
}