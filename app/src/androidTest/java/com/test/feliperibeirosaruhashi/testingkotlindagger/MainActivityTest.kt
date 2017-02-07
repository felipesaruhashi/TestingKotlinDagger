package com.test.feliperibeirosaruhashi.testingkotlindagger

import android.app.Instrumentation
import android.support.test.InstrumentationRegistry
import android.support.test.rule.ActivityTestRule
import org.junit.Before
import org.junit.Rule
import javax.inject.Inject

class MainActivityTest {

    @Inject lateinit
    var testMock: TestMock

    @JvmField @Rule
    var  activityRule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java, true, false)


    @Before
    fun setUp() {
        var instrumentation: Instrumentation = InstrumentationRegistry.getInstrumentation()

        var app:App = instrumentation.targetContext.applicationContext as App

        var component:MockAppComponent = app.component as MockAppComponent

        component.inject(this)
    }

}
