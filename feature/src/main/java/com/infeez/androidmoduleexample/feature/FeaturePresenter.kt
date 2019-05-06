package com.infeez.androidmoduleexample.feature

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter

@InjectViewState
class FeaturePresenter(
    private val id: Int,
    private val data: String?
) : MvpPresenter<FeatureView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        viewState.showLongMessage("Hello, World!\nI'm feature!")
        viewState.setId(id)
        data?.run {
            viewState.setData(this)
        }
    }
}