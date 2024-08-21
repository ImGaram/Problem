package problems.silver.s5

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val size = readLine().toInt()
    val result = StringBuilder()

    for (i in size downTo 1) {
        result.append("$i ")
    }

    println(result)
}