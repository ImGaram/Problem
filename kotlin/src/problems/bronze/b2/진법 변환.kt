package problems.bronze.b2

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (num, decimal) = readLine().split(" ")
    println(num.toInt(decimal.toInt()))
}