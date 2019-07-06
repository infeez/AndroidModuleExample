package com.infeez.androidmoduleexample

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import com.infeez.androidmoduleexample.navigation.Navigator
import org.koin.core.KoinComponent
import org.koin.core.inject
import ru.terrakok.cicerone.Router

@InjectViewState
class MainPresenter : MvpPresenter<MainView>(), KoinComponent {

    private val navigator by inject<Navigator>()

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        navigator.router.newRootScreen(Screens.Features)
    }
}