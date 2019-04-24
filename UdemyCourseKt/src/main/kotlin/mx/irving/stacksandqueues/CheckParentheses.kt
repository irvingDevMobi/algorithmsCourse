package mx.irving.stacksandqueues

fun checkParentheses(input: String): Boolean {
    if (input.length % 2 != 0) return false
    val stack = mutableListOf<Char>()
    for (c in input) {
        when (c) {
            '{', '(', '[' -> stack.add(c)
            '}' -> {
                val top = stack.removeAt(stack.size - 1)
                if (top != '{') return false
            }
            ')' -> {
                val top = stack.removeAt(stack.size - 1)
                if (top != '(') return false
            }
            ']' -> {
                val top = stack.removeAt(stack.size - 1)
                if (top != '[') return false
            }
        }
    }
    return stack.isEmpty()
}

fun checkParenthesesUde(input: String): Boolean {
    if (input.length % 2 != 0) return false
    val openings = setOf('(', '[', '{')
    val matches = setOf(Pair('(', ')'), Pair('[', ']'), Pair('{', '}'))
    val stack = mutableListOf<Char>()
    for (c in input) {
        if (c in openings)
            stack.add(c)
        else {
            if (stack.size == 0) return false
            val lastOpen = stack.removeAt(stack.size - 1)
            if (Pair(lastOpen, c) !in matches) return false
        }
    }
    return stack.isEmpty()
}