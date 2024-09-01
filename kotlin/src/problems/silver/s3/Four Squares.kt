package problems.silver.s3

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min
import kotlin.math.sqrt

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val number = readLine().toInt()
    val dp = Array(number + 1) { 0 }
    dp[1] = 1

    for (i in 2 .. number) {
        var min = Int.MAX_VALUE
        for (j in 1 .. sqrt(i.toDouble()).toInt()) {
            val index = i - j * j
            min = min(min, dp[index])
        }

        dp[i] = min + 1
    }

    println(dp[number])
}