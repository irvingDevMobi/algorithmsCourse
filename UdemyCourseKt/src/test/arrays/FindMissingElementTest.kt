package test.arrays

import mx.irving.arrays.find
import org.junit.Test
import kotlin.test.assertEquals

class FindMissingElementTest {

    @Test
    fun test() {
        assertEquals(5, find(arrayOf(5, 5, 7, 7), arrayOf(5, 7, 7)))
        assertEquals(5, find(arrayOf(1, 2, 3, 4, 5, 6, 7), arrayOf(3, 7, 2, 1, 4, 6)))
        assertEquals(6, find(arrayOf(9, 8, 7, 6, 5, 4, 3, 2, 1), arrayOf(9, 8, 7, 5, 4, 3, 2, 1)))
    }
}