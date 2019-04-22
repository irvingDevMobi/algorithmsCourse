package mx.irving.arrays

import kotlin.math.max
import kotlin.math.min

fun pairSum(list: List<Int>, objective: Int): Int {
    var count = 0
    for (x in list.indices) {
        for (y in (x + 1) until list.size) {
            if (list[x] + list[y] == objective)
                count += 1
        }
    }
    return count
}

fun pairSumSol(list: List<Int>, objective: Int): Int {
    if (list.size < 2) return 0
    val seen = HashSet<Int>()
    val output = HashSet<Pair<Int, Int>>()
    for (num in list) {
        val differenceTarget = objective - num
        if (differenceTarget in seen) output.add(Pair(min(num, differenceTarget), max(num, differenceTarget)))
        else seen.add(num)
    }
    return output.size
}

