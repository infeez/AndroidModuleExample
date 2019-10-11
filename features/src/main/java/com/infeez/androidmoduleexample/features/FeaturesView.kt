package com.infeez.androidmoduleexample.features

import moxy.MvpView
import moxy.viewstate.strategy.AddToEndSingleStrategy
import moxy.viewstate.strategy.SkipStrategy
import moxy.viewstate.strategy.StateStrategyType

@StateStrategyType(AddToEndSingleStrategy::class)
interface FeaturesView : MvpView {

    @StateStrategyType(SkipStrategy::class)
    fun showLongMessage(text: String)
}