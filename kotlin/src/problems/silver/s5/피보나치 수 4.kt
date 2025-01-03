package problems.silver.s5

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val n = bf.readLine().toInt()
    val dp = Array(n + 1) { 0.toBigInteger() }

    for (i in 1 .. n) {
        if (i == 1) dp[1] = 1.toBigInteger()
        else dp[i] = dp[i - 1] + dp[i - 2]
    }

    println(dp[n])
}