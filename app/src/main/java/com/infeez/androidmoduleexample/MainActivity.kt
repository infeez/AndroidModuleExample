package com.infeez.androidmoduleexample

import android.os.Bundle
import androidx.navigation.Navigation.findNavController
import com.arellomobile.mvp.MvpAppCompatActivity
import com.arellomobile.mvp.presenter.InjectPresenter
import com.infeez.androidmoduleexample.navigation.Navigator
import org.koin.android.ext.android.inject

class MainActivity : MvpAppCompatActivity(), StubView {

    @InjectPresenter
    lateinit var presenter: StubPresenter

    private val navigator by inject<Navigator>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        navigator.bind(findNavController(this, R.id.nav_host_fragment))
    }

    override fun onPause() {
        super.onPause()
        navigator.unbind()
    }
}
