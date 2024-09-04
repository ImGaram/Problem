package problems.bronze.b3

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val case = readLine().toInt()
    var answer = "See you next month"
    var questions = 0

    for (i in 0 until case) {
        val (event, cnt) = readLine().split(" ").map { it.toInt() }

        when (event) {
            1 -> questions += cnt
            2 -> {
                questions -= cnt

                if (questions < 0) answer = "Adios"
            }
        }
    }

    println(answer)
}