package com.test.feliperibeirosaruhashi.testingkotlindagger

import android.app.Application


open class App : Application() {


    var component:ApplicationComponent? = null

    override fun onCreate() {
        super.onCreate()

        component = createComponent()


    }


    open fun createComponent(): ApplicationComponent? {
        return DaggerApplicationComponent.builder().build()
    }
}
