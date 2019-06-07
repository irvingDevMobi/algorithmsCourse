package mx.irving.recursion

import org.junit.Assert.*
import org.junit.Test

class RecursionHomeworkKtTest {

    @Test
    fun recSum_tests() {
        assertEquals(10, recSum(4))
        assertEquals(0, recSum(0))
        assertEquals(1, recSum(1))
    }

    @Test
    fun recSumDigits_tests() {
        assertEquals(10, recSumDigits(4321))
        assertEquals(0, recSumDigits(0))
        assertEquals(7, recSumDigits(7))
    }

    @Test
    fun recWordSplit_tests() {
        val phrase = "themanran"
        val words = arrayListOf("the", "ran", "man")
        val expected = arrayListOf("the", "man", "ran")
        assertEquals(expected, recWordSplit(phrase, words))

        val phrase2 = "ilovedogsJohn"
        val words2 = arrayListOf("i", "am", "a", "dogs", "lover", "love", "John")
        val expected2 = arrayListOf("i", "love", "dogs", "John")
        assertEquals(expected2, recWordSplit(phrase2, words2))

        val words3 = arrayListOf("clown", "ran", "man")
        assertTrue(recWordSplit(phrase, words3).isEmpty())
    }
}