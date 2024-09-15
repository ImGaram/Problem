package problems.silver.s3

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.sqrt

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val case = readLine().toInt()

    for (i in 0 until case) {
        val n = readLine().toLong()
        val ans = (-1 + sqrt(1.0 + 8 * n)) / 2

        println(ans.toLong())
    }
}