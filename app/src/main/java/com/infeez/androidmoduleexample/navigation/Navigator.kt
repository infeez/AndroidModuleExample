package com.infeez.androidmoduleexample.navigation

import org.koin.core.KoinComponent
import org.koin.core.get
import org.koin.core.qualifier.named
import ru.terrakok.cicerone.Cicerone
import ru.terrakok.cicerone.Router
import ru.terrakok.cicerone.android.support.SupportAppNavigator

class Navigator : KoinComponent {

    private val cicerone: Cicerone<Router> = get(named("Cicerone"))
    private var navigator: SupportAppNavigator? = null

    fun bind(navigator: SupportAppNavigator) {
        this.navigator = navigator
        cicerone.navigatorHolder.setNavigator(navigator)
    }

    fun unbind() {
        cicerone.navigatorHolder.removeNavigator()
    }

    val router = cicerone.router
}