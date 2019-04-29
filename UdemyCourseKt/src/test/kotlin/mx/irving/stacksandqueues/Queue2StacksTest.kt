package mx.irving.stacksandqueues

import org.junit.Assert.*
import org.junit.Test

class Queue2StacksTest{

    @Test
    fun test() {
        val queue = Queue2Stacks()
        for (x in 0..5) queue.queue(x)
        assertEquals(0, queue.dequeue())
        assertEquals(1, queue.dequeue())
        assertEquals(2, queue.dequeue())
        assertEquals(3, queue.dequeue())
        assertEquals(4, queue.dequeue())
    }
}
