package problems.bronze.b1

import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    while (true) {
        val case = nextInt()
        if (case == 0) break

        val strMap = mutableMapOf<String, String>()
        for (i in 0 until case) {
            val input = next()
            strMap[input.lowercase()] = input
        }

        println(strMap[strMap.minOf { it.key }])
    }
}