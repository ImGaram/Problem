package problems.silver

import java.io.BufferedReader
import java.io.InputStreamReader

private val dp = Array(21) { Array(21) { Array(21) { 0 } } }

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    while (true) {
        val (a, b, c) = readLine().split(" ").map { it.toInt() }
        if (a == -1 && b == -1 && c == -1) break
        else println("w($a, $b, $c) = ${w(a, b, c)}")
    }
}

private fun w(a: Int, b: Int, c: Int): Int {
    return if (a <= 0 || b <= 0 || c <= 0) 1
    else if (a > 20 || b > 20 || c > 20) w(20, 20, 20)
    else if (dp[a][b][c] != 0) {
        // 기존 데이터 재사용.
        return dp[a][b][c]
    } else if (a < b && b < c) {
        dp[a][b][c] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c)
        return dp[a][b][c]
    } else {
        dp[a][b][c] = w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1)
        return dp[a][b][c]
    }
}