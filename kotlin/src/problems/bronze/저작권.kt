package problems.bronze

import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val album = nextInt()
    val average = nextInt()

    println(album * (average - 1) + 1)
}