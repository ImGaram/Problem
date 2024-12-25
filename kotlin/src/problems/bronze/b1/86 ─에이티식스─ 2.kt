package problems.bronze.b1

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val n = bf.readLine().toInt()
    var locale = listOf<Int>()
    val region = mutableListOf<List<Int>>()
    var answer = "Lena"

    for (i in 0 until n) {
        val line = bf.readLine().split(" ").map { it.toInt() }

        for (j in line.indices) {
            if (line[j] == 1) region.add(listOf(i, j))
            if (line[j] == 2) locale = listOf(i, j)
        }
    }

    for (i in region.indices) {
        val distance = abs(locale[0] - region[i][0]) + abs(locale[1] - region[i][1])
        if (distance % 2 == 0) answer = "Kiriya"
    }

    println(answer)
}