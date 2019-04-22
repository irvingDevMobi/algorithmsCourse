package mx.irving.arrays

import org.junit.Assert.assertEquals
import org.junit.Test

class StringCompressionTest {

    @Test
    fun tes() {
        assertEquals("A4B2", compress("AAAABB"))
        assertEquals("", compress(""))
        assertEquals(compress("AABBCC"), "A2B2C2")
        assertEquals(compress("AAABCCDDDDD"), "A3B1C2D5")
    }
}