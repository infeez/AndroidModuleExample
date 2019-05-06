package com.infeez.androidmoduleexample.feature

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.ProvidePresenter
import com.infeez.androidmoduleexample.R
import com.infeez.core.utils.XMvpAppCompatFragment
import kotlinx.android.synthetic.main.fr_feature.*

class FeatureFragment : XMvpAppCompatFragment(), FeatureView {

    @InjectPresenter
    lateinit var presenter: FeaturePresenter

    @ProvidePresenter
    fun providePresenter() = FeaturePresenter(arguments!!.getInt(ID), arguments!!.getString(DATA))

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fr_feature, container, false)

    override fun showLongMessage(text: String) {
        Toast.makeText(activity, text, Toast.LENGTH_LONG).show()
    }

    override fun setId(id: Int) {
        tv_id.text = id.toString()
    }

    override fun setData(data: String) {
        tv_data.text = data
    }

    companion object {
        private const val ID = "id"
        private const val DATA = "data"
        fun createBundle(id: Int, data: String? = null) = bundleOf(ID to id, DATA to data)
    }
}