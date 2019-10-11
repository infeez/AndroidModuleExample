package com.infeez.androidmoduleexample.features

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.infeez.androidmoduleexample.R
import kotlinx.android.synthetic.main.fr_features.*
import moxy.MvpAppCompatFragment
import moxy.ktx.moxyPresenter
import org.koin.android.ext.android.get

class FeaturesFragment : MvpAppCompatFragment(), FeaturesView {

    private val presenter by moxyPresenter {
        get<FeaturesPresenter>()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fr_features, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        b_first_feature.setOnClickListener { presenter.openFirstFeature() }
        b_second_feature.setOnClickListener { presenter.openSecondFeature() }
        b_third_feature.setOnClickListener { presenter.openThirdFeature() }
    }

    override fun showLongMessage(text: String) {
        Toast.makeText(activity, text, Toast.LENGTH_LONG).show()
    }

    companion object {

        fun newInstance() = FeaturesFragment()
    }
}