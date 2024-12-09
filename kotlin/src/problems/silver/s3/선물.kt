package problems.silver.s3

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val (n, b) = bf.readLine().split(" ").map { it.toInt() }
    val payList = mutableListOf<List<Int>>()
    var answer = 0

    for (i in 0 until n) {
        val (p, s) = bf.readLine().split(" ").map { it.toInt() }

        payList.add(listOf(p, s))
    }
    payList.sortBy { it.sum() }

    for (discountIndex in payList.indices) {
        var m = b - (payList[discountIndex][0] / 2 + payList[discountIndex][1])
        var presentCnt = 1

        if (m < 0) continue
        for (i in payList.indices) {
            if (m - payList[i].sum() >= 0 && discountIndex != i) {
                m -= payList[i].sum()
                presentCnt++
            }
        }

        answer = max(answer, presentCnt)
    }

    println(answer)
}