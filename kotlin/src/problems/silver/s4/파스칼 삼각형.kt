package problems.silver.s4

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (r, c, w) = readLine().split(" ").map { it.toInt() }
    val dp = Array(r + w) { Array(r + w + 1) { 0 } }

    dp[1][1] = 1
    dp[2][1] = 1
    dp[2][2] = 1

    for (i in 3 until r + w) {
        for (j in 1 .. r + w) {
            if (j == 1) dp[i][j] = 1
            else dp[i][j] = dp[i - 1][j] + dp[i - 1][j - 1]
        }
    }

    var answer = 0
    var cnt = 1
    for (i in r until r + w) {
        for (j in c until c + cnt) {
            answer += dp[i][j]
        }
        cnt++
    }

    println(answer)
}