package problems.silver.s3

import java.io.BufferedReader
import java.io.InputStreamReader

private const val mod = 1000000007

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val n = bf.readLine().toInt()
    val dp = Array(n + 1) { 1 }

    for (i in 2 until dp.size) {
        dp[i] = (dp[i - 1] + dp[i - 2] + 1) % mod
    }

    println(dp[n])
}