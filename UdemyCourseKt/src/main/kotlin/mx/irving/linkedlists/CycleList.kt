package mx.irving.linkedlists

fun isACircleList(node: Node): Boolean {
    var next = node.nextNode
    while (next != null) {
        if (next == node) return true
        next = next.nextNode
    }
    return false
}

fun isACircleListUde(node: Node?): Boolean {
    var marker1: Node? = node
    var marker2: Node? = node
    while (marker2?.nextNode != null) {
        marker1 = marker1?.nextNode
        marker2 = marker2.nextNode?.nextNode
        if (marker2 == marker1) return true
    }
    return false
}
