package com.example.testapp

import androidx.test.platform.app.InstrumentationRegistry
import junit.framework.TestCase.assertNull
import org.junit.Test

class MainActivityTest {
    @Test
    fun test() {
        val contentResolver = SampleContentResolver(InstrumentationRegistry.getInstrumentation().targetContext)
        assertNull(contentResolver.acquire())
    }
}

