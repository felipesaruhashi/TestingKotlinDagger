package com.test.feliperibeirosaruhashi.testingkotlindagger

import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Singleton
@Module
class MockTestModule {

    @Provides
    @Singleton
    fun providesTestModule(): TestMock{
        return TestMock()
    }
}

