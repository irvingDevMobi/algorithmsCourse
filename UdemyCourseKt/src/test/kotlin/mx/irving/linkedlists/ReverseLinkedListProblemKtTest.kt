package mx.irving.linkedlists

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Test

class ReverseLinkedListProblemKtTest {

    @Test
    fun test_linkedList() {
        val a = Node(1)
        val b = Node(2)
        val c = Node(3)
        val d = Node(4)
        a.nextNode = b
        b.nextNode = c
        c.nextNode = d
        reverseLinkedList(a)
        assertEquals(d.nextNode?.value, c.value)
        assertEquals(c.nextNode?.value, b.value)
        assertEquals(b.nextNode?.value, a.value)
        assertNull(a.nextNode)
    }

    @Test
    fun test_circleLinkedList() {
        val a = Node(1)
        val b = Node(2)
        val c = Node(3)
        val d = Node(4)
        a.nextNode = b
        b.nextNode = c
        c.nextNode = d
        d.nextNode = a
        reverseLinkedList(a)
        assertEquals(d.nextNode?.value, c.value)
        assertEquals(c.nextNode?.value, b.value)
        assertEquals(b.nextNode?.value, a.value)
        assertEquals(a.nextNode?.value, d.value)
    }

}