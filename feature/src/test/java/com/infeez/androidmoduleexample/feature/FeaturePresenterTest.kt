package com.infeez.androidmoduleexample.feature

import io.mockk.mockkClass
import io.mockk.spyk
import io.mockk.verify
import org.junit.Test

class FeaturePresenterTest {

    @Test
    fun `first attach`() {
        val viewState = mockkClass(type = `FeatureView$$State`::class, relaxed = true)
        val presenter = FeaturePresenter(1, "param 1")
        presenter.setViewState(viewState)
        presenter.attachView(spyk())

        verify {
            viewState.showLongMessage("Hello, World!\nI'm feature!")
        }
        verify {
            viewState.setId(1)
        }
        verify {
            viewState.setData("param 1")
        }
    }
}