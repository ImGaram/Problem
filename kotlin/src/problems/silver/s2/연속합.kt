package problems.silver.s2

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val numberCnt = readLine().toInt()
    val numbers = readLine().split(" ").map { it.toInt() }
    val res = Array(numberCnt) { 0 }
    res[0] = numbers[0]

    for (i in 1 until numbers.size) {
        res[i] = max(res[i - 1] + numbers[i], numbers[i])
    }

    println(res.max())
}