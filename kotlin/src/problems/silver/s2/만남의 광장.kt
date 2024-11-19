package problems.silver.s2

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val (n, m) = bf.readLine().split(" ").map { it.toInt() }
    val map = Array(n) { Array(m) { 0 } }

    val verticalSum = Array(n) { 0 }
    val horizontalSum = Array(m) { 0 }

    for (i in 0 until n) {
        val line = bf.readLine().split(" ").map { it.toInt() }.toTypedArray()
        for (j in line.indices) {
            horizontalSum[j] = horizontalSum[j] + line[j]
        }

        verticalSum[i] = line.sum()
        map[i] = line
    }

    var res = Int.MIN_VALUE
    for (i in 0 until n) {
        for (j in 0 until m) {
            for (k in i + 1 until n) {
                for (l in j + 1 until m) {
                    val sum = verticalSum[i] + horizontalSum[j] + verticalSum[k] + horizontalSum[l] -
                            map[i][j] - map[k][l] - map[i][l] - map[k][j] +
                            (k - i - 1) * (l - j - 1)

                    res = max(res, sum)
                }
            }
        }
    }

    println(res)
}