package src.problems.bronze

import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val case = nextInt()

    repeat(case) {
        var result = 2015
        val alphabet = next().toMutableList()
        alphabet.distinct().forEach {
            result -= it.code
        }

        println(result)
    }
}