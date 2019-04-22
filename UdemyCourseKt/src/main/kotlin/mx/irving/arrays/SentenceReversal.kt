package mx.irving.arrays

fun reverseSentence(sentence: String): String {
    val cleanSentence = sentence.trim()
    val words = cleanSentence.split("\\s+".toRegex())
    val reversedSentence = StringBuilder()
    for (i in words.size - 1 downTo 0) {
        reversedSentence.append(words[i])
        if (i != 0) reversedSentence.append(' ')
    }
    return reversedSentence.toString()
}

fun reverseManually(sentence: String): String {
    var sentenceReverse = ""
    var wordIt = ""
    for (index in sentence.length - 1 downTo 0) {
        if (sentence[index] == ' ' && wordIt.isNotEmpty()) {
            sentenceReverse = if (sentenceReverse.isEmpty()) wordIt else "$sentenceReverse $wordIt"
            wordIt = ""
        } else if (sentence[index] != ' ') {
            wordIt = sentence[index] + wordIt
        }
    }
    if (wordIt.isNotBlank()) {
        sentenceReverse = if (sentenceReverse.isEmpty()) wordIt else "$sentenceReverse $wordIt"
    }
    return sentenceReverse
}