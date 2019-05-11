package com.infeez.androidmoduleexample.features

import io.mockk.mockkClass
import io.mockk.spyk
import io.mockk.verify
import org.junit.Test

class FeaturesPresenterTest {

    @Test
    fun `show message on attach`() {
        val viewState = mockkClass(type = `FeaturesView$$State`::class, relaxed = true)
        val presenter = FeaturesPresenter(spyk())
        presenter.setViewState(viewState)
        presenter.attachView(spyk())

        verify {
            viewState.showLongMessage("Hello, World!\nI'm main features screen!")
        }
    }

    @Test
    fun `open first feature`() {
        val nav = spyk<FeaturesNavigation>()
        val presenter = FeaturesPresenter(nav)
        presenter.openFirstFeature()

        verify {
            nav.openFeature(1, "Hello! I'm param 1")
        }
    }

    @Test
    fun `open second feature`() {
        val nav = spyk<FeaturesNavigation>()
        val presenter = FeaturesPresenter(nav)
        presenter.openSecondFeature()

        verify {
            nav.openFeature(2, "Hello! I'm param 2")
        }
    }

    @Test
    fun `open third feature`() {
        val nav = spyk<FeaturesNavigation>()
        val presenter = FeaturesPresenter(nav)
        presenter.openThirdFeature()

        verify {
            nav.openFeature(3, "Hello! I'm param 3")
        }
    }
}