package mx.irving.arrays

fun find(array1: Array<Int>, array2: Array<Int>): Int {
    var difference = 0
    for (index in 0 until array2.size) {
        difference += array1[index] - array2[index]
    }
    return difference + array1.last()
}