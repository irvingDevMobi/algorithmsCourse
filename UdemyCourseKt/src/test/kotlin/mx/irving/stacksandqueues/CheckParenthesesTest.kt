package mx.irving.stacksandqueues

import org.junit.Assert.assertEquals
import org.junit.Test

class CheckParenthesesTest {

	@Test
	fun test() {
		assertEquals(false, checkParentheses("[](){([[[]]])}("))
		assertEquals(true,checkParentheses("[{{{(())}}}]((()))"))
		assertEquals(false, checkParentheses("[[[]])]"))
	}
}