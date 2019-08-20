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
        assertEquals(165580141, fibonnaci(41))
    }

    @Test
    fun fibonnaciDynamic_ok() {
        assertEquals(55, fibonnaciDynamic(10))
        assertEquals(1, fibonnaciDynamic(1))
        assertEquals(28657, fibonnaciDynamic(23))
        assertEquals(1346269, fibonnaciDynamic(31))
        assertEquals(165580141, fibonnaciDynamic(41))
    }
}