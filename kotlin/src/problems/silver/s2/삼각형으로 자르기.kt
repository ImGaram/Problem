package problems.silver.s2

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs
import kotlin.math.max

private val points = mutableListOf<List<Int>>()
private var selectedPoints = mutableListOf<List<Int>>()
private var max = 0.0

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val pointCnt = readLine().toInt()

    for (i in 0 until pointCnt) {
        val (x, y) = readLine().split(" ").map { it.toInt() }
        points.add(listOf(x, y))
    }

    for (i in 0 until points.size) {
        for (j in i+1 until points.size) {
            for (k in j+1 until points.size) {
                selectedPoints = mutableListOf(points[i], points[j], points[k])
                val area = getTriangleArea()
                max = max(max, area)
            }
        }
    }

    println(max)
}

private fun getTriangleArea(): Double {
    var diagonalX = 0
    var diagonalY = 0

    for (i in 0 until selectedPoints.size) {
        if (i == selectedPoints.size - 1) {
            diagonalX += selectedPoints[i][0] * selectedPoints[0][1]
            diagonalY += selectedPoints[i][1] * selectedPoints[0][0]
        } else {
            diagonalX += selectedPoints[i][0] * selectedPoints[i+1][1]
            diagonalY += selectedPoints[i][1] * selectedPoints[i+1][0]
        }
    }

    return abs(diagonalX - diagonalY) / 2.0
}