package mx.irving.recursion

import org.junit.Assert.assertEquals
import org.junit.Test

class FibonnaciKtTest {

    @Test
    fun fibonnaci_ok() {
        assertEquals(1, fibonnaci(1))
        assertEquals(1, fibonnaci(2))
        assertEquals(55, fibonnaci(10))
        assertEquals(28657, fibonnaci(23))
        assertEquals(1346269, fibonnaci(31))
        assertEquals(165580141, fibonnaci(41))
    }

    @Test
    fun fibonnaciDynamic_ok() {
        assertEquals(1, fibonnaciDynamic(1))
        assertEquals(1, fibonnaciDynamic(2))
        assertEquals(55, fibonnaciDynamic(10))
        assertEquals(28657, fibonnaciDynamic(23))
        assertEquals(1346269, fibonnaciDynamic(31))
        assertEquals(165580141, fibonnaciDynamic(41))
    }

    @Test
    fun fibonnaciIterative_ok() {
        assertEquals(1, fibonnaciIterative(1))
        assertEquals(1, fibonnaciIterative(2))
        assertEquals(55, fibonnaciIterative(10))
        assertEquals(28657, fibonnaciIterative(23))
        assertEquals(1346269, fibonnaciIterative(31))
        assertEquals(165580141, fibonnaciIterative(41))
    }
}
