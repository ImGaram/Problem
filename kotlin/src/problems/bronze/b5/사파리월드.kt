package problems.bronze.b5

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (a, b) = readLine().split(" ").map { it.toLong() }
    println(abs(a - b))
}