package mx.irving.recursion

import org.junit.Assert.*
import org.junit.Test

class CoinChangeKtTest {

    @Test
    fun getMinCoins_ok() {
        val coins = listOf(1, 5, 10, 25)
        assertEquals(3, getMinCoins(45, coins))
        assertEquals(5, getMinCoins(23, coins))
        assertEquals(8, getMinCoins(74, coins))
    }

    @Test
    fun getMinCoinsDynamic_ok() {
        val coins = listOf(1, 5, 10, 25)
        assertEquals(3, getMinCoinsDynamic(45, coins))
        assertEquals(5, getMinCoinsDynamic(23, coins))
        assertEquals(8, getMinCoinsDynamic(74, coins))
    }
}
