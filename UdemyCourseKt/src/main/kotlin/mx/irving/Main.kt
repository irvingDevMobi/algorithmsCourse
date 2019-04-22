package mx.irving

import mx.irving.arrays.AnagramJ
import mx.irving.arrays.areAnagram

fun main(args: Array<String>) {

    anagram()
}

fun anagram() {
    val s1 = "DOGS R"
    val s2 = "DOGS "
    val s3 = "GODS"
    val s4 = "Astronomer"
    val s5 = "Moon starer"

    println("${areAnagram(s1, s2)} : ${AnagramJ.areAnagram(s1, s2)}")
    println("${areAnagram(s3, s2)} : ${AnagramJ.areAnagram(s3, s2)}")
    println("${areAnagram(s3, s4)} : ${AnagramJ.areAnagram(s3, s4)}")
    println("${areAnagram(s5, s4)} : ${AnagramJ.areAnagram(s5, s4)}")

}
