package com.infeez.androidmoduleexample

import com.infeez.androidmoduleexample.feature.FeatureFragment
import com.infeez.androidmoduleexample.features.FeaturesFragment
import ru.terrakok.cicerone.android.support.SupportAppScreen

object Screens {

    object Features : SupportAppScreen() {
        override fun getFragment() = FeaturesFragment.newInstance()
    }

    data class Feature(
        val id: Int,
        val data: String
    ) : SupportAppScreen() {
        override fun getFragment() = FeatureFragment.newInstance(id, data)
    }
}