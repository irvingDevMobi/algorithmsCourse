package mx.irving.arrays

import org.junit.Assert.assertEquals
import org.junit.Test

class PairSumTest {

    @Test
    fun test() {
        assertEquals(0, pairSum(listOf(1), 5))
        assertEquals(0, pairSum(listOf(1, 5), 5))
        assertEquals(6, pairSum(listOf(1, 9, 2, 8, 3, 7, 4, 6, 5, 5, 13, 14, 11, 13, -1), 10))
        assertEquals(2, pairSum(listOf(1, 3, 2, 2), 4))
    }

    @Test
    fun testSol() {
        assertEquals(0, pairSumSol(listOf(1), 5))
        assertEquals(0, pairSumSol(listOf(1, 5), 5))
        assertEquals(6, pairSumSol(listOf(1, 9, 2, 8, 3, 7, 4, 6, 5, 5, 13, 14, 11, 13, -1), 10))
        assertEquals(2, pairSumSol(listOf(1, 3, 2, 2), 4))
        assertEquals(1, pairSumSol(listOf(1, 3, 2, 1), 3))
    }
}
