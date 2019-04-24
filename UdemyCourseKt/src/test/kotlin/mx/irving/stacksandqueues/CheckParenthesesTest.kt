package mx.irving.stacksandqueues

import org.junit.Assert.assertEquals
import org.junit.Test

class CheckParenthesesTest {

    @Test
    fun test() {
        // 4 ms
        assertEquals(false, checkParentheses("[](){([[[]]])}("))
        assertEquals(true, checkParentheses("[{{{(())}}}]((()))"))
        assertEquals(true, checkParentheses("[{{{(())}}}]((()))[{{{(())}}}]((()))[{{{(())}}}]((()))[{{{(())}}}]((()))"))
        assertEquals(false, checkParentheses("[[[]])]"))
    }

    @Test
    fun testUde() {
        // 58 ms
        assertEquals(false, checkParenthesesUde("[](){([[[]]])}("))
        assertEquals(true, checkParenthesesUde("[{{{(())}}}]((()))"))
        assertEquals(true, checkParenthesesUde("[{{{(())}}}]((()))[{{{(())}}}]((()))[{{{(())}}}]((()))[{{{(())}}}]((()))"))
        assertEquals(false, checkParenthesesUde("[[[]])]"))
    }
}
