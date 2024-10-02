package problems.bronze.b5

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val case = readLine().toInt()

    for (i in 0 until case) {
        val (a, b, x) = readLine().split(" ").map { it.toInt() }
        println(a * (x - 1) + b)
    }
}