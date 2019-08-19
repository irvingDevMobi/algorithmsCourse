package mx.irving.recursion

import org.junit.Assert.*
import org.junit.Test

class FibonnaciKtTest {

    @Test
    fun fibonnaci_ok() {
        assertEquals(55, fibonnaci(10))
        assertEquals(1, fibonnaci(1))
        assertEquals(28657, fibonnaci(23))
        assertEquals(1346269, fibonnaci(31))
    }
}