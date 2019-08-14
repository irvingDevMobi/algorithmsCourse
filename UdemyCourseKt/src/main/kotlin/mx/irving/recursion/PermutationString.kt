package mx.irving.recursion

import mx.irving.utils.Tabs


fun permutation(
    sentence: CharArray,
    tope: Int = sentence.size,
    output: ArrayList<String>
) {
    if (tope == 1) {
        output.add(sentence.joinToString(""))
        return
    }

    for (i in 0 until tope) {
        permutation(sentence, tope - 1, output)
        val index = if (tope % 2 == 1) 0 else i
        val temp = sentence[index]
        sentence[index] = sentence[tope - 1]
        sentence[tope - 1] = temp
    }
}


fun permutationPrint(
    sentence: CharArray,
    tope: Int = sentence.size,
    output: ArrayList<String>,
    tabs: Tabs = Tabs() // Only to debug algorithm
) {
    println("\n${tabs.value}Sentence Input: ${sentence.joinToString("")}")
    println("${tabs.value}Tope: $tope")
    if (tope == 1) {
        tabs.add()
        val combination = sentence.joinToString("")
        println("${tabs.value}Adding: $combination")
        output.add(combination)
        tabs.remove()
        return
    }
    println("${tabs.value}For 0 until $tope")
    for (i in 0 until tope) {
        tabs.add()
        println("${tabs.value}ith element: $i START....")
        val newTope = tope - 1
        println("${tabs.value}permutation(${sentence.joinToString("")}, $newTope)")
        permutationPrint(sentence, newTope, output, tabs)
        val swapIndexStart = if (tope % 2 == 1) 0 else i
        val swapIndexEnd = tope - 1
        println("${tabs.value}swap position $swapIndexStart with $swapIndexEnd")
        println("${tabs.value}sentence before swap: ${sentence.joinToString("")}")
        val temp = sentence[swapIndexStart]
        sentence[swapIndexStart] = sentence[swapIndexEnd]
        sentence[swapIndexEnd] = temp
        println("${tabs.value}sentence swaped: ${sentence.joinToString("")}")
        println("${tabs.value}....ith element: $i END")
        tabs.remove()
    }
}


fun main() {
    val sentence = "abc"
    val permutations = arrayListOf<String>()
    permutationPrint(sentence.toCharArray(), sentence.length, permutations)
    println("****************")
    println("****************")
    println("****************")
    for ((index, combination) in permutations.withIndex()) println("${index + 1} $combination")
}
