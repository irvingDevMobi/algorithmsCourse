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