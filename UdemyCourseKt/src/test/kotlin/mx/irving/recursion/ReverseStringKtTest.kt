package mx.irving.recursion

import org.junit.Assert.*
import org.junit.Test

class ReverseStringKtTest {

    @Test
    fun reverseTest() {
        assertEquals("olleh", reverse("hello"))
        assertEquals("dlrow olleh", reverse("hello world"))
        assertEquals("987654321", reverse("123456789"))
    }
}