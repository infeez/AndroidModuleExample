package com.infeez.androidmoduleexample.navigation

import androidx.navigation.NavController

class Navigator {

    var navController: NavController? = null

    fun bind(navController: NavController) {
        this.navController = navController
    }

    fun unbind() {
        navController = null
    }

}