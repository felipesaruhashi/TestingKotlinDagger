package com.test.feliperibeirosaruhashi.testingkotlindagger

import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = arrayOf(TestModule::class))
interface ApplicationComponent {
    fun inject(mainActivity: MainActivity)
}