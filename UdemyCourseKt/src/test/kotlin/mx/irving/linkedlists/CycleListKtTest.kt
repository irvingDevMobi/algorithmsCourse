package mx.irving.linkedlists

import org.junit.Assert.*
import org.junit.Test

class CycleListKtTest {

    private val a = Node(1)
    private val b = Node(2)
    private val c = Node(3)

    private val x = Node('1')
    private val y = Node('3')
    private val z = Node('2')

    private val i = Node(8)

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

    @Test
    fun test1_ude() {
        a.nextNode = b
        b.nextNode = c
        assertFalse(isACircleListUde(a))
    }

    @Test
    fun test2_ude() {
        x.nextNode = y
        y.nextNode = z
        z.nextNode = x
        assertTrue(isACircleListUde(y))
    }

    @Test
    fun test3_ude() {
        i.nextNode = i
        assertTrue(isACircleListUde(i))
    }
}