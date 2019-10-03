package com.infeez.androidmoduleexample

import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import androidx.test.rule.ActivityTestRule
import com.agoda.kakao.screen.Screen
import com.agoda.kakao.screen.Screen.Companion.onScreen
import com.agoda.kakao.text.KButton
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class FeatureTest {

    @Rule
    @JvmField
    val rule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun firstFeatureTest() {
        onScreen<FeaturesScreen> {
            button1 {
                click()
            }
        }
    }

}

class FeaturesScreen : Screen<FeaturesScreen>() {

    val button1 = KButton { withId(R.id.b_first_feature) }
    val button2 = KButton { withId(R.id.b_second_feature) }
    val button3 = KButton { withId(R.id.b_third_feature) }

}