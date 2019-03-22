package mx.irving.arrays

fun largestContinuousSum(array: Array<Int>): Int {

    if (array.size == 1) return array.first()

    val newArray = arrayListOf<Int>()
    var firstCycleSum = array.first()
    var sense = firstCycleSum >= 0

    for (i in 1 until array.size) {
        if (sense == array[i] >= 0) {
            firstCycleSum += array[i]
        } else {
            sense = array[i] >= 0
            newArray.add(firstCycleSum)
            firstCycleSum = array[i]
        }
    }
    newArray.add(firstCycleSum)

    var maxSum = 0
    for (j in 0 until newArray.size) {
        if (newArray[j] < 0) continue
        var sumIterator = newArray[j]
        var pivot = j
        while (pivot + 2 < newArray.size) {
            val sumProvisional = sumIterator + newArray[pivot + 1] + newArray[pivot + 2]
            if (sumProvisional >= sumIterator) {
                sumIterator = sumProvisional
                pivot += 2
            } else break
        }
        if (maxSum < sumIterator) maxSum = sumIterator
    }
    return maxSum
}