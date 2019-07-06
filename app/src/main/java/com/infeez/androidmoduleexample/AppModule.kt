package com.infeez.androidmoduleexample

import com.infeez.androidmoduleexample.features.FeaturesNavigation
import com.infeez.androidmoduleexample.features.FeaturesPresenter
import com.infeez.androidmoduleexample.navigation.FeaturesNavigationImpl
import com.infeez.androidmoduleexample.navigation.Navigator
import org.koin.core.qualifier.named
import org.koin.dsl.module
import ru.terrakok.cicerone.Cicerone

fun modules() = listOf(navigationModule, presentersModule)

val navigationModule = module {

    single(named("Cicerone")) {
        Cicerone.create()
    }

    single {
        Navigator()
    }

    single<FeaturesNavigation> {
        FeaturesNavigationImpl()
    }
}

val presentersModule = module {

    factory { MainPresenter() }

    factory { FeaturesPresenter() }
}