package mx.irving.arrays

fun compress(sentence: String): String {
    if (sentence.isBlank()) return sentence
    var count = 1
    var current = sentence.first()
    var output = ""
    for (char in sentence.substring(1)) {
        if (current == char) count += 1
        else {
            output += current + count.toString()
            current = char
            count = 1
        }
    }
    output += current + count.toString()
    return output
}