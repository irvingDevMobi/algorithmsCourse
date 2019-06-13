package mx.irving.recursion

fun reverse(phrase: String): String {
    return if (phrase.isEmpty() || phrase.length == 1) phrase
    else phrase.last() + reverse(phrase.substring(0, phrase.length - 1))
}