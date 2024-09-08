package problems.gold.g5

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val string1 = readLine().map { it }
    val string2 = readLine().map { it }
    val dp = Array(string1.size + 1) { Array(string2.size + 1) { 0 } }

    for (i in 1 .. string1.size) {
        for (j in 1 .. string2.size) {
            if (string1[i - 1] == string2[j - 1]) dp[i][j] = dp[i - 1][j - 1] + 1
            else dp[i][j] = max(dp[i - 1][j], dp[i][j - 1])
        }
    }

    println(dp.last().last())
}