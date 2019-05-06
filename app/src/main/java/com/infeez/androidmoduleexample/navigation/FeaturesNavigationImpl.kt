package com.infeez.androidmoduleexample.navigation

import com.infeez.androidmoduleexample.R
import com.infeez.androidmoduleexample.feature.FeatureFragment
import com.infeez.androidmoduleexample.features.FeaturesNavigation
import org.koin.core.KoinComponent
import org.koin.core.inject

class FeaturesNavigationImpl : FeaturesNavigation, KoinComponent {

    private val nav by inject<Navigator>()

    override fun openFeature(id: Int, data: String) {
        nav.navController?.navigate(
            R.id.action_featuresFragment_to_featureFragment,
            FeatureFragment.createBundle(id, data)
        )
    }
}