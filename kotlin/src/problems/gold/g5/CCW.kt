package problems.gold.g5

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val pointList = mutableListOf<List<Int>>()
    for (i in 0 until 3) {
        val point = readLine().split(" ").map { it.toInt() }
        pointList.add(point)
    }

    // ccw 알고리즘: 각 점의 방향성을 파악할 수 있다.
    // 점들의 좌표를 정의한 후 사선 공식(신발끈 공식)을 이용해 문제를 해결할 수 있다.
    // x: x1, y1   y: x2, y2   z: x3, y3
    // x1 x2 x3 x1
    // y1 y2 y3 y1
    val ccw = ccw(
        x1 = pointList[0][0], y1 = pointList[0][1],
        x2 = pointList[1][0], y2 = pointList[1][1],
        x3 = pointList[2][0], y3 = pointList[2][1]
    )
    if (ccw > 0) println(1)
    else if (ccw < 0) println(-1)
    else println(0)
}

private fun ccw(x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int): Int {
    val a = x1 * y2 + x2 * y3 + x3 * y1
    val b = y1 * x2 + y2 * x3 + y3 * x1
    return a - b
}