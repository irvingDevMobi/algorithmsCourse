package mx.irving.arrays

fun find(array1: Array<Int>, array2: Array<Int>): Int {
    var difference = 0
    for (index in 0 until array2.size) {
        difference += array1[index] - array2[index]
    }
    return difference + array1.last()
}

fun finder(arr1: Array<Int>, arr2: Array<Int>): Int {
    arr1.sort()
    arr2.sort()

    for ((num1, num2) in arr1.zip(arr2)) {
        if (num1 != num2)
            return num1
    }
    return arr1.last()
}

fun finder2(array1: Array<Int>, array2: Array<Int>): Int {
    val map = hashMapOf<Int, Int>()

    for (num in array2) {
        map[num] = map[num]?.plus(1) ?: 1
    }

    for (num in array1) {
        if (map[num] == 0 || !map.containsKey(num))
            return num
        else map[num] = map[num]?.minus(1) ?: -1
    }
    return -1
}

fun finder3(array1: Array<Int>, array2: Array<Int>): Int {
    var result = 0
    // Perform an XOR operation between the numbers in the arrays
    for (num in array1 + array2) {
        result = result xor num
    }
    return result
}