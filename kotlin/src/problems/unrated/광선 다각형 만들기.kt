package problems.unrated

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val mirrors = readLine().toInt()
    val angleOfIncidence = readLine().split(" ").map { it.toInt() }
    val totalAngle = angleOfIncidence.sumOf { it * 2 }

    println(180 * (mirrors - 1) - totalAngle)
}