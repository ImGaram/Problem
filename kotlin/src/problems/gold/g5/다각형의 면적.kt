package problems.gold.g5

import java.io.BufferedReader
import java.io.InputStreamReader
import java.math.BigDecimal
import java.math.RoundingMode
import kotlin.math.abs

private var points = mutableListOf<List<Long>>()

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val case = readLine().toInt()

    for (i in 0 until case) {
        val (x,y) = readLine().split(" ").map { it.toLong() }
        points.add(listOf(x, y))
    }

    val area = getArea().setScale(1, RoundingMode.HALF_UP)
    println(area)
}

private fun getArea(): BigDecimal {
    var diagonalX = 0L
    var diagonalY = 0L
    for (i in 0 until points.size) {
        if (i == points.size - 1) {
            diagonalX += points[i][0] * points[0][1]
            diagonalY += points[i][1] * points[0][0]
        } else {
            diagonalX += points[i][0] * points[i+1][1]
            diagonalY += points[i][1] * points[i+1][0]
        }
    }

    return BigDecimal.valueOf(abs(diagonalX - diagonalY) / 2.0)
}