package mx.irving.linkedlists

fun nToLast(n: Int, head: Node): Node? {
    if (n == 0) return null
    var count = 1
    var pivot: Node? = head
    var searcher: Node? = head
    while (count < n) {
        if (pivot?.nextNode == null)
            return null
        pivot = pivot.nextNode
        count += 1
    }
    while (pivot?.nextNode != null) {
        searcher = searcher?.nextNode
        pivot = pivot.nextNode
    }
    return searcher
}
