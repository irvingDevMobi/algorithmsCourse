package mx.irving.recursion

/**
 *
 * Given a target amount n and a list (array) of distinct coin values,
 * what's the fewest coins needed to make the change amount.
 *
 * For example:
 *
 * If n = 10 and coins = [1,5,10]. Then there are 4 possible ways to make change:
 *
 * 1+1+1+1+1+1+1+1+1+1
 * 5 + 1+1+1+1+1
 * 5+5
 * 10
 *
 * With 1 coin being the minimum amount.
 *
 * We assume that coins will be order from min to max coin value and
 * always the min is 1
 */
fun getMinCoins(target: Int, coins: List<Int>): Int {
    return if (target == 0 || coins.isEmpty()) target
    else {
        val coinsNumber: Int = target / coins.last()
        val newTarget = target.rem(coins.last())
        coinsNumber + getMinCoins(newTarget, coins.subList(0, coins.size - 1))
    }
}
