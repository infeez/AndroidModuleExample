package com.infeez.androidmoduleexample

import android.os.Bundle
import com.infeez.androidmoduleexample.navigation.Navigator
import moxy.MvpAppCompatActivity
import moxy.presenter.InjectPresenter
import moxy.presenter.ProvidePresenter
import org.koin.android.ext.android.get
import org.koin.android.ext.android.inject
import ru.terrakok.cicerone.android.support.SupportAppNavigator

class MainActivity : MvpAppCompatActivity(), MainView {

    @InjectPresenter
    lateinit var presenter: MainPresenter

    @ProvidePresenter
    fun providePresenter(): MainPresenter = get()

    private val navigator: Navigator by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResumeFragments() {
        super.onResumeFragments()
        navigator.bind(SupportAppNavigator(this, R.id.main_container))
    }

    override fun onPause() {
        navigator.unbind()
        super.onPause()
    }
}
