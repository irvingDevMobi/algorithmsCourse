package mx.irving.stacksandqueues

class Queue2Stacks(
    private val stack1: MutableList<Any> = mutableListOf(),
    private val stack2: MutableList<Any> = mutableListOf()
) {

    fun queue(element: Any) {
        stack1.add(element)
    }

    fun dequeue(): Any? {
        if (stack1.isEmpty() && stack2.isEmpty()) return null
        if (stack2.isEmpty()) {
            while (stack1.isNotEmpty())
                stack2.add(stack1.removeAt(stack1.size - 1))
        }
        return stack2.removeAt(stack2.size - 1)
    }
}
