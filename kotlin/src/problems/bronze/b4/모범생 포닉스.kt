package problems.bronze.b4

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val case = readLine().toInt()
    val times = readLine().split(" ").map { it.toInt() }
    val sum = times.sum() + (8 * (case - 1))

    println("${sum / 24} ${sum % 24}")
}