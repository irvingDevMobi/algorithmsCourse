package test.arrays

import mx.irving.arrays.reverseSentence
import org.junit.Test
import kotlin.test.assertEquals

class SentenceReversalTest {

    @Test
    fun test() {
        assertEquals("before space", reverseSentence("     space before"))
        assertEquals("after space", reverseSentence("space after     "))
        assertEquals("you are how John Hello", reverseSentence("   Hello John    how are you   "))
        assertEquals("1", reverseSentence("1"))
    }
}