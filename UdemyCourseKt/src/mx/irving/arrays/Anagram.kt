package mx.irving.arrays

fun areAnagram(sentence1: String, sentence2: String): Boolean {
    val s1 = sentence1.replace(" ", "").toLowerCase()
    val s2 = sentence2.replace(" ", "").toLowerCase()
    if (s1.length != s2.length) return false

    val lettersMap: HashMap<Char, Int> = hashMapOf()
    for (letter in s1) {
        if (lettersMap.containsKey(letter)) {
            lettersMap[letter] = lettersMap[letter]!! + 1
        } else {
            lettersMap[letter] = 1
        }
    }
    for (letter in s2) {
        if (lettersMap.containsKey(letter)) {
            lettersMap[letter] = lettersMap[letter]!! - 1
        } else {
            return false
        }
    }
    for (c in lettersMap.values) {
        if (c != 0)
            return false
    }
    return true
}
