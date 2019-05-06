package com.infeez.androidmoduleexample.feature

import com.arellomobile.mvp.MvpView
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy
import com.arellomobile.mvp.viewstate.strategy.SkipStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType

@StateStrategyType(AddToEndSingleStrategy::class)
interface FeatureView : MvpView {

    @StateStrategyType(SkipStrategy::class)
    fun showLongMessage(text: String)

    fun setId(id: Int)

    fun setData(data: String)
}