package test.arrays

import mx.irving.arrays.compress
import org.junit.Test
import kotlin.test.assertEquals

class StringCompressionTest {

    @Test
    fun tes() {
        assertEquals("A4B2", compress("AAAABB"))
        assertEquals("", compress(""))
        assertEquals(compress("AABBCC"), "A2B2C2")
        assertEquals(compress("AAABCCDDDDD"), "A3B1C2D5")
    }
}