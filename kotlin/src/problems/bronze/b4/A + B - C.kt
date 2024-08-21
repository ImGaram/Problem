package src.problems.bronze

import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val a = nextInt()
    val b = nextInt()
    val c = nextInt()

    println(a+b-c)
    println((a.toString() + b.toString()).toInt() - c)
}