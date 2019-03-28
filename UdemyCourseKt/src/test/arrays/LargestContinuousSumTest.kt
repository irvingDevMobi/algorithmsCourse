package test.arrays

import mx.irving.arrays.largestContinuousSumCourse
import mx.irving.arrays.largestContinuousSum
import org.junit.Test
import kotlin.test.assertEquals

class LargestContinuousSumTest {

    @Test
    fun test() {
        assertEquals(9, largestContinuousSum(arrayOf(1, 2, -1, 3, 4, -1)))
        assertEquals(1, largestContinuousSum(arrayOf(1, -1)))
        assertEquals(29, largestContinuousSum(arrayOf(1, 2, -1, 3, 4, 10, 10, -10, -1)))
        assertEquals(7, largestContinuousSum(arrayOf(-2, -3, 4, -1, -2, 1, 5, -3)))
        assertEquals(6, largestContinuousSum(arrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)))
        assertEquals(10, largestContinuousSum(arrayOf(1, -1, 1, -1, 10, -5, 1, -1, 3, -1)))
    }

    @Test
    fun testCourse() {
        assertEquals(9, largestContinuousSumCourse(arrayOf(1, 2, -1, 3, 4, -1)))
        assertEquals(1, largestContinuousSumCourse(arrayOf(1, -1)))
        assertEquals(29, largestContinuousSumCourse(arrayOf(1, 2, -1, 3, 4, 10, 10, -10, -1)))
        assertEquals(7, largestContinuousSumCourse(arrayOf(-2, -3, 4, -1, -2, 1, 5, -3)))
        assertEquals(6, largestContinuousSumCourse(arrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)))
        assertEquals(10, largestContinuousSumCourse(arrayOf(1, -1, 1, -1, 10, -5, 1, -1, 3, -1)))
    }
}