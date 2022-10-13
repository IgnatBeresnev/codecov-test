package me.beresnev.codecov.test

import org.junit.Test

class Tests {

    @Test
    fun shouldCheckFoo() {
        TestFile().foo()
    }

    @Test
    fun shouldCheckBaz() {
        TestFile().baz()
    }

    @Test
    fun shouldCheckQuxTrue() {
        TestFile().qux(true)
    }

    @Test
    fun checkNothing() {
        // jacoco without method line number
    }
}
