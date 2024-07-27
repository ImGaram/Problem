package problems.silver

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val case = readLine().toInt()
    val dp = Array(101) { 0L }
    dp[1] = 1
    dp[2] = 1
    dp[3] = 1
    dp[4] = 2
    dp[5] = 2

    for (i in 0 until case) {
        val number = readLine().toInt()

        if (number <= 5 || dp[number] != 0L) {
            println(dp[number])
            continue
        }

        var startPoint = 1
        for (j in 6 .. number) {
            dp[j] = dp[startPoint] + dp[j - 1]
            startPoint++
        }
        println(dp[number])
    }
}