package problems.gold.g5

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val cnt = readLine().toInt()
    val points = mutableListOf<List<Int>>()
    var triangles = 0

    for (i in 0 until cnt) {
        points.add(readLine().split(" ").map { it.toInt() })
    }

    for (i in 0 until points.size) {
        for (j in i + 1 until points.size) {
            for (k in j + 1 until points.size) {
                val distance1 = getPointDistance(points[i][0], points[i][1], points[j][0], points[j][1])
                val distance2 = getPointDistance(points[j][0], points[j][1], points[k][0], points[k][1])
                val distance3 = getPointDistance(points[k][0], points[k][1], points[i][0], points[i][1])

                if (distance1 == distance2 + distance3 || distance2 == distance1 + distance3 || distance3 == distance1 + distance2) {
                    triangles++
                }
            }
        }
    }

    println(triangles)
}

private fun getPointDistance(x1: Int, y1: Int, x2: Int, y2: Int): Long {
    val distanceX = ((x2 - x1).toLong() * (x2 - x1).toLong())
    val distanceY = ((y2 - y1).toLong() * (y2 - y1).toLong())
    return distanceX + distanceY
}