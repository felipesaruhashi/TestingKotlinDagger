package com.test.feliperibeirosaruhashi.testingkotlindagger

import dagger.Component

@Component(modules = arrayOf(MockTestModule::class))
interface MockAppComponent {
    fun inject(mainActivityTest:MainActivityTest)
}
