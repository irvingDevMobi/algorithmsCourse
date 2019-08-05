package mx.irving.recursion


fun permutation(
    sentence: CharArray,
    tope: Int = sentence.size,
    output: ArrayList<String>
) {
    if (tope == 1) {
        output.add(sentence.joinToString(""))
    }

    for (i in 0 until tope) {
        permutation(sentence, tope - 1, output)
        val index = if (tope % 2 == 1) 0 else i
        val temp = sentence[index]
        sentence[index] = sentence[tope - 1]
        sentence[tope - 1] = temp
    }
}


fun main() {
    val sentence = "1234"
    val permutations = arrayListOf<String>()
    permutation(sentence.toCharArray(), sentence.length, permutations)
    for ((index, combination) in permutations.withIndex()) println("${index + 1} $combination")
}
