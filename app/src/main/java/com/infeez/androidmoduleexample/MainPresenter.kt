package com.infeez.androidmoduleexample

import com.infeez.androidmoduleexample.navigation.Navigator
import moxy.InjectViewState
import moxy.MvpPresenter
import org.koin.core.KoinComponent
import org.koin.core.inject

@InjectViewState
class MainPresenter : MvpPresenter<MainView>(), KoinComponent {

    private val navigator by inject<Navigator>()

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        navigator.router.newRootScreen(Screens.Features)
    }
}