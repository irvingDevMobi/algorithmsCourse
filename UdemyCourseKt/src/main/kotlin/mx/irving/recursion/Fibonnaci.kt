package mx.irving.recursion

fun fibonnaci(num: Int): Long {
    //println("Fibonnaci of $num")
    return if (num < 1) 0
    else if (num == 1) 1
    else fibonnaci(num - 1) + fibonnaci(num - 2)
}

