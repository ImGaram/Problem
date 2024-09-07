package problems.silver.s1

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val length = readLine().toInt()
    val string = readLine()

    println((length + 1) * 26 - length)
}