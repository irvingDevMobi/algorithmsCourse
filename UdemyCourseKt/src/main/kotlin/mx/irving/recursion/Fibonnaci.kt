package mx.irving.recursion

fun fibonnaci(num: Int): Long {
    return when {
        num < 1 -> 0
        num == 1 -> 1
        else -> fibonnaci(num - 1) + fibonnaci(num - 2)
    }
}

val cache = LongArray(30) { -1L }

fun fibonnaciDynamic(num: Int): Long {
    return when {
        num < 0 -> 0
        num < cache.size && cache[num] >= 0 -> cache[num]
        num < 1 -> {
            cache[0] = 0
            cache[0]
        }
        num == 1 -> {
            cache[1] = 1
            cache[1]
        }
        else -> {
            val oneBackNum = num - 1
            val twoBackNum = num - 2
            val fibonnaciOneBack = fibonnaciDynamic(oneBackNum)
            val fibonnaciTwoBack = fibonnaciDynamic(twoBackNum)
            if (twoBackNum < cache.size) {
                cache[twoBackNum] = fibonnaciTwoBack
                if (oneBackNum < cache.size) {
                    cache[oneBackNum] = fibonnaciOneBack
                }
            }
            fibonnaciOneBack + fibonnaciTwoBack
        }
    }
}

fun fibonnaciIterative(num: Int): Long {
    if (num < 1) return 0
    if (num == 1) return 1
    var sumTwoBack = 0L
    var sumOneBack = 1L
    var result = 0L
    for (i in 2..num) {
        result = sumOneBack + sumTwoBack
        sumTwoBack = sumOneBack
        sumOneBack = result
    }
    return result
}

fun fibonnaciIterativeCourse(num: Int): Long {
    var a = 0L
    var b = 1L
    var piv: Long
    for (i in 1..num) {
        piv = a
        a = b
        b += piv
    }
    return a
}
