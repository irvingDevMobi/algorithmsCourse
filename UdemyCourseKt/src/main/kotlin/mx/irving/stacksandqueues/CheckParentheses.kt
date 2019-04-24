package mx.irving.stacksandqueues

fun checkParentheses(input: String): Boolean {
	val stack = mutableListOf<Char>()
	for(c in input) {
		when(c) {
			'{', '(', '[' -> stack.add(c)
			'}' -> {
					val top = stack.removeAt(stack.size -1)
					if (top != '{') return false
				}
			')' -> {
					val top = stack.removeAt(stack.size -1)
					if (top != '(') return false
				}
			']' -> {
					val top = stack.removeAt(stack.size -1)
					if (top != '[') return false
				}
		}
	}
	return stack.isEmpty()
}
