package problems.silver.s3

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val dp = Array(n + 1) { Array(m + 1) { 0L } }
    val mod = 1000000007
    dp[1][1] = 1

    for (i in 1 until dp.size) {
        for (j in 1 until dp[i].size) {
            if (dp[i][j] == 0L) {
                dp[i][j] = (dp[i-1][j] + dp[i][j-1] + dp[i-1][j-1]) % mod
            }
        }
    }

    println(dp[n][m])
}