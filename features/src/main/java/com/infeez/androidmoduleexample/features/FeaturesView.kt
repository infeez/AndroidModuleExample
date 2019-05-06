package com.infeez.androidmoduleexample.features

import com.arellomobile.mvp.MvpView
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy
import com.arellomobile.mvp.viewstate.strategy.SkipStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType

@StateStrategyType(AddToEndSingleStrategy::class)
interface FeaturesView : MvpView {

    @StateStrategyType(SkipStrategy::class)
    fun showLongMessage(text: String)
}