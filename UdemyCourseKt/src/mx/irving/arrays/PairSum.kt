package mx.irving.arrays

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

