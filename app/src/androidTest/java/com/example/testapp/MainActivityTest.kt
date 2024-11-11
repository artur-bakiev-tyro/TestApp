package com.example.testapp

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.junit.Test

class MainActivityTest {
    @Test
    fun test() {
        assertThat(1, equalTo(1))
    }
}