package problems.silver.s3

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.sqrt

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val case = readLine().toInt()
    val resultSb = StringBuilder()

    for (i in 0 until case) {
        val (startX, startY, endX, endY) = readLine().split(" ").map { it.toInt() }
        val planetCnt = readLine().toInt()
        var entryAndExit = 0

        for (j in 0 until planetCnt) {
            val (centerX, centerY, radius) = readLine().split(" ").map { it.toInt() }

            val distanceStartX = abs(startX - centerX).toDouble()
            val distanceStartY = abs(startY - centerY).toDouble()
            val distanceStart = sqrt(distanceStartX.pow(2) + distanceStartY.pow(2))

            val distanceEndX = abs(endX - centerX).toDouble()
            val distanceEndY = abs(endY - centerY).toDouble()
            val distanceEnd = sqrt(distanceEndX.pow(2) + distanceEndY.pow(2))

            if (distanceStart <= radius && distanceEnd <= radius) {
                continue
            } else if (distanceStart <= radius || distanceEnd <= radius) {
                entryAndExit++
            }
        }

        resultSb.append("$entryAndExit\n")
    }

    println(resultSb)
}