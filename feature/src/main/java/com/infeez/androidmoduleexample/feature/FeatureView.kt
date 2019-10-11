package com.infeez.androidmoduleexample.feature

import moxy.MvpView
import moxy.viewstate.strategy.AddToEndSingleStrategy
import moxy.viewstate.strategy.SkipStrategy
import moxy.viewstate.strategy.StateStrategyType


@StateStrategyType(AddToEndSingleStrategy::class)
interface FeatureView : MvpView {

    @StateStrategyType(SkipStrategy::class)
    fun showLongMessage(text: String)

    fun setId(id: Int)

    fun setData(data: String)
}