package mx.irving.linkedlists

fun isACircleList(node: Node): Boolean {
    var next = node.nextNode
    while (next != null) {
        if (next == node) return true
        next = next.nextNode
    }
    return false
}