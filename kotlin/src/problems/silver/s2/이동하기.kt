package problems.silver.s2

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val (n, m) = bf.readLine().split(" ").map { it.toInt() }
    val dp = Array(n) { Array(m) { 0 } }
    val candy = Array(n) { listOf<Int>() }

    for (i in 0 until n) {
        val candyLine = bf.readLine().split(" ").map { it.toInt() }
        candy[i] = candyLine

        if (i == 0) {
            dp[0][0] = candyLine[0]
            for (j in 1 until m) {
                dp[0][j] = dp[0][j - 1] + candyLine[j]
            }
        }
    }

    for (i in 1 until n) {
        for (j in 0 until m) {
            if (j == 0) dp[i][j] = dp[i - 1][j] + candy[i][j]
            else {
                val case = listOf(
                    dp[i - 1][j],
                    dp[i][j - 1],
                    dp[i - 1][j - 1]
                )
                dp[i][j] = case.max() + candy[i][j]
            }
        }
    }

    println(dp[n - 1][m - 1])
}