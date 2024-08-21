package src.problems.bronze

import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val input = next()
    val index = nextInt()

    println(input[index-1])
}