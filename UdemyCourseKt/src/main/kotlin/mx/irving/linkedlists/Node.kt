package mx.irving.linkedlists

data class Node(
    var value: Any,
    var nextNode: Node? = null
)

val a = Node(1)
val b = Node(2)
val c = Node(3)

fun main() {
    a.nextNode = b
    b.nextNode = c

    println(a.nextNode)
    println(b)
}