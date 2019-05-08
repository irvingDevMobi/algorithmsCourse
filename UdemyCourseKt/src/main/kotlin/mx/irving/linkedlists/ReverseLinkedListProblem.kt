package mx.irving.linkedlists

fun reverseLinkedList(head: Node) {
    var nextNode: Node? = head.nextNode
    var currentNode: Node? = head
    var pivot: Node?
    while (nextNode != null && nextNode != head) {
        pivot = nextNode.nextNode
        nextNode.nextNode = currentNode
        currentNode = nextNode
        nextNode = pivot
    }
    head.nextNode = if (nextNode == null) null else currentNode
}
