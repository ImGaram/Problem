package src.problems.silver

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.sqrt

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val case = readLine().toInt()

    for (i in 0 until case) {
        val pointList = mutableListOf<List<Int>>()

        for (j in 0 until 4) {
            pointList.add(readLine().split(" ").map { it.toInt() })
        }

        // 각 점간의 거리 게산(대각선 포함)
        val distanceList = mutableListOf<Double>()
        var a: Long = (pointList[0][0] - pointList[1][0]).toLong()
        var b: Long = (pointList[0][1] - pointList[1][1]).toLong()
        distanceList.add(sqrt((a * a + b * b).toDouble()))
        a = (pointList[0][0] - pointList[2][0]).toLong()
        b = (pointList[0][1] - pointList[2][1]).toLong()
        distanceList.add(sqrt((a * a + b * b).toDouble()))
        a = (pointList[0][0] - pointList[3][0]).toLong()
        b = (pointList[0][1] - pointList[3][1]).toLong()
        distanceList.add(sqrt((a * a + b * b).toDouble()))
        a = (pointList[1][0] - pointList[2][0]).toLong()
        b = (pointList[1][1] - pointList[2][1]).toLong()
        distanceList.add(sqrt((a * a + b * b).toDouble()))
        a = (pointList[1][0] - pointList[3][0]).toLong()
        b = (pointList[1][1] - pointList[3][1]).toLong()
        distanceList.add(sqrt((a * a + b * b).toDouble()))
        a = (pointList[2][0] - pointList[3][0]).toLong()
        b = (pointList[2][1] - pointList[3][1]).toLong()
        distanceList.add(sqrt((a * a + b * b).toDouble()))

        // distanceList에서 중복 제거 값이 1이면 정사각형
        // distanceList에서 대각선 길이가 다르면 정사각형 아님.
        // distanceList에서 중복제거 했을 때, 결과가 3개이상 나오면 정사각형 아님.
        val distanceSet = distanceList.toSet()
        when (distanceSet.size) {
            1 -> println(1)
            2 -> println(1)
            else -> println(0)
        }
    }
}