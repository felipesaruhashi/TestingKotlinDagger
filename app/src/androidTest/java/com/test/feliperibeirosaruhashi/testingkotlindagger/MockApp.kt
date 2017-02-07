package com.test.feliperibeirosaruhashi.testingkotlindagger

class MockApp : App() {

    override fun createComponent(): ApplicationComponent? {
        

//        return DaggerMockAppComponent().builder().build()
        return super.createComponent()
    }
}