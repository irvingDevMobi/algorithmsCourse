package mx.irving.arrays

import org.junit.Test
import kotlin.test.assertEquals

fun uniqueCharts(sentence: String): Boolean {
    val chartsFounds: HashSet<Char> = HashSet()
    for (c in sentence) {
        if (chartsFounds.contains(c)) return false
        else chartsFounds.add(c)
    }
    return true
}

class UniqueCharactersTest {
    @Test
    fun test() {
        assertEquals(uniqueCharts(""), true)
        assertEquals(uniqueCharts("goo"), false)
        assertEquals(uniqueCharts("abcdefg"), true)
    }
}