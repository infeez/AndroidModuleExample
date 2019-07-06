package com.infeez.androidmoduleexample.extensions

import androidx.fragment.app.Fragment
import ru.terrakok.cicerone.android.support.SupportAppScreen

fun createScreen(create: () -> Fragment) = object : SupportAppScreen() {
    override fun getFragment(): Fragment {
        return create()
    }
}