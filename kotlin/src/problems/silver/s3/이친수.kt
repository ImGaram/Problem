package problems.silver.s3

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val n = bf.readLine().toInt()
    val dp = Array(n + 1) { 0L }
    dp[1] = 1L

    for (i in 2 .. n) {
        dp[i] = dp[i - 1] + dp[i - 2]
    }

    println(dp[n])
}