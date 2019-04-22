package mx.irving.arrays

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test


class UniqueChartsTest {

    @Test
    fun test() {
        assertTrue(uniqueCharts(""))
        assertFalse(uniqueCharts("goo"))
        assertTrue(uniqueCharts("abcdefg"))
    }
}
