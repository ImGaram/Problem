package problems.bronze.b1

import java.io.BufferedReader
import java.io.InputStreamReader
import java.text.DecimalFormat

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))

    while (true) {
        val input = bf.readLine() ?: break
        val split = input.split(" ").map { it.toDouble() }
        val x1 = split[0] + 10000
        val y1 = split[1] + 10000
        val x2 = split[2] + 10000
        val y2 = split[3] + 10000
        val x3 = split[4] + 10000
        val y3 = split[5] + 10000
        val x4 = split[6] + 10000
        val y4 = split[7] + 10000

        if (x1 == x3 && y1 == y3) {
            get4thPoint(listOf(x2, y2), listOf(x1, y1), listOf(x4, y4))
        } else if (x1 == x4 && y1 == y4) {
            get4thPoint(listOf(x2, y2), listOf(x1, y1), listOf(x3, y3))
        } else if (x2 == x3 && y2 == y3) {
            get4thPoint(listOf(x1, y1), listOf(x2, y2), listOf(x4, y4))
        } else if (x2 == x4 && y2 == y4) {
            get4thPoint(listOf(x1, y1), listOf(x2, y2), listOf(x3, y3))
        }
    }
}

private fun get4thPoint(point1: List<Double>, point2: List<Double>, point3: List<Double>) {
    // point2가 꼭짓점
    val decimalFormat = DecimalFormat("0.000")
    val resultX = point1[0] + point3[0] - point2[0] - 10000
    val resultY = point1[1] + point3[1] - point2[1] - 10000
    println("${decimalFormat.format(resultX)} ${decimalFormat.format(resultY)}")
}