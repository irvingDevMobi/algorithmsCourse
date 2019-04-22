package mx.irving.arrays


fun uniqueCharts(sentence: String): Boolean {
    val chartsFounds: HashSet<Char> = HashSet()
    for (c in sentence) {
        if (chartsFounds.contains(c)) return false
        else chartsFounds.add(c)
    }
    return true
}
