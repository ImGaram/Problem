package problems.silver.s2

import java.io.InputStreamReader
import java.io.BufferedReader
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (h, w) = readLine().split(" ").map { it.toInt() }
    val dp = Array(h) { Array(w) { 0 } }

    for (i in 0 until h) {
        val mine = readLine().split(" ").map { it.toInt() }

        if (i == 0) dp[i][0] = mine[0]
        else {
            if (mine[0] == 1) dp[i][0] = dp[i-1][0] + 1
            else dp[i][0] = dp[i-1][0]
        }

        for (j in 1 until mine.size) {
            if (i == 0) {
                if (mine[j] == 1) dp[i][j] = dp[i][j-1] + 1
                else dp[i][j] = dp[i][j-1]
            } else {
                if (mine[j] == 1) dp[i][j] = max(dp[i - 1][j] + 1, dp[i][j - 1] + 1)
                else dp[i][j] = max(dp[i - 1][j], dp[i][j - 1])
            }
        }
    }

    println(dp.last().last())
}