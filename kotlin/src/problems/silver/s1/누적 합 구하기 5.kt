package problems.silver.s1

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val (n, m) = bf.readLine().split(" ").map { it.toInt() }
    val premixSum = Array(n + 1) { Array(n + 1) { 0 } }

    for (i in 1 .. n) {
        val nums = bf.readLine().split(" ").map { it.toInt() }

        for (j in 1 .. n) {
            premixSum[i][j] = premixSum[i][j - 1] + nums[j - 1] + premixSum[i - 1][j] - premixSum[i - 1][j - 1]
        }
    }

    val sb = StringBuilder()
    for (mi in 0 until m) {
        val (x1, y1, x2, y2) = bf.readLine().split(" ").map { it.toInt() }
        sb.append("${premixSum[x2][y2] - premixSum[x2][y1 - 1] - premixSum[x1 - 1][y2] + premixSum[x1 - 1][y1 - 1]}\n")
    }

    print(sb)
}