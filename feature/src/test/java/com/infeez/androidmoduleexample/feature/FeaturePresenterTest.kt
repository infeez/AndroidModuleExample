package com.infeez.androidmoduleexample.feature

import io.mockk.mockk
import io.mockk.verifyAll
import org.junit.Test

class FeaturePresenterTest {

    @Test
    fun `first attach`() {
        val presenter = FeaturePresenter(1, "param 1")
        val view = mockk<FeatureView>(relaxed = true)
        presenter.attachView(view)

        verifyAll {
            view.showLongMessage("Hello, World!\nI'm feature!")
            view.setId(1)
            view.setData("param 1")
        }
    }
}