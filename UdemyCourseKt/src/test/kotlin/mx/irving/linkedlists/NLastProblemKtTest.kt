package mx.irving.linkedlists

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class NLastProblemKtTest {

    val a = Node(1)
    val b = Node(2)
    val c = Node(3)
    val d = Node(4)
    val e = Node(5)

    @Before
    fun init() {
        a.nextNode = b
        b.nextNode = c
        c.nextNode = d
        d.nextNode = e
    }

    @Test
    fun test_common() {
        assertEquals(d, nToLast(2, a))
    }

    @Test
    fun test_1toLast() {
        assertEquals(e, nToLast(1, a))
    }

    @Test
    fun test_allToLast() {
        assertEquals(a, nToLast(5, a))
    }

    @Test
    fun test_nLargerThanListSize() {
        assertNull(nToLast(6, a))
    }
}
