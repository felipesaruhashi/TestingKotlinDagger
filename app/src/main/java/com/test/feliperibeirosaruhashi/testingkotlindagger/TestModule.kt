package com.test.feliperibeirosaruhashi.testingkotlindagger

import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class TestModule {

    @Provides
    @Singleton
    fun providesTestModule(): Test {
        return Test()
    }

}
