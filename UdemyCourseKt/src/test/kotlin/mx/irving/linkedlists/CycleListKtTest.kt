package mx.irving.linkedlists

import org.junit.Assert.*
import org.junit.Test

class CycleListKtTest {

    val a = Node(1)
    val b = Node(2)
    val c = Node(3)

    val x = Node('1')
    val y = Node('3')
    val z = Node('2')

    val i = Node(8)

    @Test
    fun test1() {
        a.nextNode = b
        b.nextNode = c
        assertFalse(isACircleList(a))
    }

    @Test
    fun test2() {
        x.nextNode = y
        y.nextNode = z
        z.nextNode = x
        assertTrue(isACircleList(y))
    }

    @Test
    fun test3() {
        i.nextNode = i
        assertTrue(isACircleList(i))
    }
}