package problems.bronze.b5

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val num = readLine().toInt()
    var answer = 1L

    for (i in 1 .. num) {
        answer *= i
    }

    println(answer)
}