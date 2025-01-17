package problems.silver.s2

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val (n, m) = bf.readLine().split(" ").map { it.toInt() }
    val dp = Array(n + 1) { 1 }
    val mod = 1000000007

    if (m <= n) dp[m] = 2
    for (i in m + 1 .. n) {
        dp[i] = (dp[i - 1] + dp[i - m]) % mod
    }

    println(dp[n])
}