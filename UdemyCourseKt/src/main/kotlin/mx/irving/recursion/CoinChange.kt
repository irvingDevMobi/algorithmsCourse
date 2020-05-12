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

/**
 * Udemy Course Solution
 *
 * INPUT: This funciton takes in a target amount and a list of possible coins to use.
 * It also takes a third parameter, known_results, indicating previously calculated results.
 * The known_results parameter shoud be started with [0] * (target+1)
 * OUTPUT: Minimum number of coins needed to make the target.
 *
 */
fun getMinCoinsDynamic(
        target: Int, coins: List<Int>,
        knowResults: MutableList<Int> = MutableList(target + 1) { 0 }
): Int {
    // Default output to target
    var minCoins = target

    when {
        // Base Case
        target in coins -> {
            knowResults[target] = 1
            return 1
        }
        // Return a known result if it happens to be greater than 1
        knowResults[target] > 0 -> {
            return knowResults[target]
        }
        else -> {
            // for every coin value that is <= than target
            for (i in coins.filter { it <= target }) {
                //Recursive call, note how we include the known results
                val numCoins = 1 + getMinCoinsDynamic(target - i, coins, knowResults)

                // Reset minimum if we have a new minimum
                if (numCoins < minCoins) {
                    minCoins = numCoins
                    // Reset the know result
                    knowResults[target] = minCoins
                }
            }
        }
    }
    return minCoins
}

