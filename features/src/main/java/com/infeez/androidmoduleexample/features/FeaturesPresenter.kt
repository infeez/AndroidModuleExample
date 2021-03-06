package com.infeez.androidmoduleexample.features

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import org.koin.core.KoinComponent
import org.koin.core.inject

@InjectViewState
class FeaturesPresenter : MvpPresenter<FeaturesView>(), KoinComponent {

    private val navigation: FeaturesNavigation by inject()

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        viewState.showLongMessage("Hello, World!\nI'm main features screen!")
    }

    fun openFirstFeature() {
        navigation.openFeature(FirstFeatureId, "Hello! I'm param 1")
    }

    fun openSecondFeature() {
        navigation.openFeature(SecondFeatureId, "Hello! I'm param 2")
    }

    fun openThirdFeature() {
        navigation.openFeature(ThirdFeatureId, "Hello! I'm param 3")
    }

    companion object {
        const val FirstFeatureId = 1
        const val SecondFeatureId = 2
        const val ThirdFeatureId = 3
    }
}