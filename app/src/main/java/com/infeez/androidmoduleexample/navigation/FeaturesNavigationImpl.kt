package com.infeez.androidmoduleexample.navigation

import com.infeez.androidmoduleexample.Screens
import com.infeez.androidmoduleexample.features.FeaturesNavigation
import org.koin.core.KoinComponent
import org.koin.core.inject

class FeaturesNavigationImpl : FeaturesNavigation, KoinComponent {

    private val navigator by inject<Navigator>()

    override fun openFeature(id: Int, data: String) {
        navigator.router.navigateTo(Screens.Feature(id, data))
    }
}