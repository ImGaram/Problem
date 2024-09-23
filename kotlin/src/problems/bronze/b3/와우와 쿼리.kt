package problems.bronze.b3

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val case = readLine().toInt()

    for (i in 0 until case) {
        val input = readLine()
        var wow = 0

        for (j in input.indices) {
            if (input[j] == 'W') {
                if (j + 2 in input.indices) {
                    if (input[j + 1] == 'O' && input[j + 2] == 'W') wow++
                }
            }
        }

        println(wow)
    }
}