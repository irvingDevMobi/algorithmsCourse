package mx.irving.queuesandstacks

class Stack {
    var data = mutableListOf<Any>()

    fun isEmpty() = data.isEmpty()

    fun push(item: Any) {
        data.add(item)
    }

    fun pop(): Any? = if (data.isEmpty()) null else data.removeAt(data.size - 1)

    fun peek(): Any? = data.lastOrNull()

    fun size() = data.size
}

fun main() {
    val stack = Stack()
    println(stack.isEmpty())
    stack.push("One")
    println(stack.size())
    stack.push(2)
    println(stack.isEmpty())
    stack.push(true)
    println(stack.size())
    println(stack.pop())
    println(stack.size())
    println(stack.peek())
    println(stack.size())
}