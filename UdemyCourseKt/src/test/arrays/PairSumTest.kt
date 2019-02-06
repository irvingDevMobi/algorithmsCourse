package test.arrays

import mx.irving.arrays.pairSum
import org.junit.Assert.assertEquals
import org.junit.Test

class PairSumTest {

    @Test
    fun test() {
        assertEquals(6, pairSum(listOf(1, 9, 2, 8, 3, 7, 4, 6, 5, 5, 13, 14, 11, 13, -1), 10))
        assertEquals(2, pairSum(listOf(1, 3, 2, 2), 4))
    }
}