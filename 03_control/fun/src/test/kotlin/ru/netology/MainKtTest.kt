package ru.netology

import org.junit.Assert.assertEquals
import org.junit.Test

class MainKtTest {

    @Test
    fun calculatePrice() {
        val expected = 1000
        val itemCount = 10

        val result = calculatePrice(itemCount)

        assertEquals(expected, result)
    }

    @Test
    fun calculatePrice_discount() {
        val expected = 900
        val itemCount = 10

        val result = calculatePrice(itemCount, discountStart = 500)

        assertEquals(expected, result)
    }
}