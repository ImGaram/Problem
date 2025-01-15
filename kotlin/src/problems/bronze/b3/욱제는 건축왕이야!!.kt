package problems.bronze.b3

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs
import kotlin.math.max

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val n = bf.readLine().toInt()
    val cList = mutableListOf<List<Int>>()

    var bc = listOf<Int>()
    var answer = 0
    for (i in 0 until n) {
        val coordinate = bf.readLine().split(" ").map { it.toInt() }

        cList.add(coordinate)
    }

    for (i in 0 until n) {
        if (i > 0) answer += getDistance(bc, cList[i])
        bc = cList[i]
    }
    answer += getDistance(cList.first(), cList.last())

    println(answer)
}

private fun getDistance(c1: List<Int>, c2: List<Int>): Int {
    return max(abs(c1[0] - c2[0]), abs(c1[1] - c2[1]))
}