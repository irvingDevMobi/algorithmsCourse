package mx.irving.recursion

fun recSum(n: Int): Int {
    return if (n == 0 || n == 1) n else n + recSum(n - 1)
}

fun recSumDigits(n: Int): Int {
    return if (n < 10) n else n % 10 + recSumDigits(n / 10)
}

fun recWordSplit(
    phrase: String,
    wordLists: ArrayList<String>,
    output: ArrayList<String> = arrayListOf()
): List<String> {
    if (phrase.isBlank()) return output
    var founded = false
    var newPhrase = phrase
    for (i in 0 until wordLists.size) {
        val word = wordLists[i]
        if (phrase.startsWith(word)) {
            output.add(word)
            wordLists.remove(word)
            newPhrase = if (phrase.length > word.length) phrase.substring(word.length) else ""
            founded = true
            break
        }
    }
    return if (founded) {
        recWordSplit(newPhrase, wordLists, output)
    } else {
        output.clear()
        recWordSplit("", arrayListOf(), output)
    }
}