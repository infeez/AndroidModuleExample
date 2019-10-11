package com.infeez.androidmoduleexample

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

// @RegisterMoxyReflectorPackages("com.infeez.androidmoduleexample.features", "com.infeez.androidmoduleexample.feature")
class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@MainApplication)
            androidLogger()
            modules(modules())
        }
    }
}