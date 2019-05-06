package com.infeez.androidmoduleexample

import com.infeez.androidmoduleexample.features.FeaturesNavigation
import com.infeez.androidmoduleexample.navigation.FeaturesNavigationImpl
import com.infeez.androidmoduleexample.navigation.Navigator
import org.koin.dsl.module

val navigationModule = module {

    single {
        Navigator()
    }

    single<FeaturesNavigation> {
        FeaturesNavigationImpl()
    }
}