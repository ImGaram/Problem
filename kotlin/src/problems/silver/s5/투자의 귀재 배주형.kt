package problems.silver.s5

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (h, y) = readLine().split(" ").map { it.toInt() }
    val dp = Array(11) { h }

    dp[1] = (h * 1.05).toInt()
    dp[2] = (dp[1] * 1.05).toInt()
    dp[3] = (h * 1.2).toInt()
    dp[4] = (dp[1] * 1.2).toInt()
    for (i in 5 .. y) {
        val profit = listOf((dp[i - 1] * 1.05).toInt(), (dp[i - 3] * 1.2).toInt(), (dp[i - 5] * 1.35).toInt())
        dp[i] = profit.max()
    }

    println(dp[y])
}