package com.github.adizcode.androiddrafts

import android.widget.ImageView
import org.junit.Assert.*
import org.junit.Test
import java.lang.Math.pow
import kotlin.math.pow

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun generates_number() {
        val result = getRandomNum(6)
        assertTrue("The value of rollResult was not between 1 and 6", result in 1..6)
    }

    @Test
    fun equals_number() {
        assertEquals(10, 5 * 2)
    }

    @Test
    fun not_equals() {
        assertNotEquals(5, 2)
    }

    @Test
    fun is_false() {
        assertFalse(2 > 2.0.pow(2.0))
    }

    @Test
    fun is_null() {
        assertNull(null)
    }

    @Test
    fun not_null() {
        assertNotNull("Hi")
    }
}