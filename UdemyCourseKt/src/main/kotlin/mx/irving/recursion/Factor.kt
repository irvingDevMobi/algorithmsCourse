package mx.irving.recursion

fun factor(n: Int): Int {
    return if (n == 0 || n == 1) 1 else n * factor(n - 1)
}

fun main() {
    println("5! = ${factor(5)}")
    println("3! = ${factor(3)}")
    println("1! = ${factor(1)}")
    println("0! = ${factor(0)}")
}
