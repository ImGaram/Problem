package problems.silver.s3

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val case = readLine().toInt()

    for (i in 0 until case) {
        val command = readLine()
        val moveXLocations = mutableListOf(0)
        val moveYLocations = mutableListOf(0)
        var currentAngle = 0

        for (cmd in command) {
            when (cmd) {
                'F' -> {
                    val moveRes = getMoveRes(moveXLocations.last(), moveYLocations.last(), currentAngle, 1)
                    moveXLocations.add(moveRes.first())
                    moveYLocations.add(moveRes.last())
                }
                'B' -> {
                    val moveRes = getMoveRes(moveXLocations.last(), moveYLocations.last(), currentAngle, -1)
                    moveXLocations.add(moveRes.first())
                    moveYLocations.add(moveRes.last())
                }
                'L' -> {
                    if (currentAngle == 0) currentAngle = 270
                    else currentAngle -= 90
                }
                'R' -> {
                    if (currentAngle == 270) currentAngle = 0
                    else currentAngle += 90
                }
            }
        }

        val xDistance = with(moveXLocations) { max() - min() }
        val yDistance = with(moveYLocations) { max() - min() }

        println(xDistance * yDistance)
    }
}

// back: -1, front: 1
private fun getMoveRes(x: Int, y: Int, currentAngle: Int, isBack: Int): List<Int> {
    return when (currentAngle) {
        0 -> listOf(x, y + (1 * isBack))
        90 -> listOf(x + (1 * isBack), y)
        180 -> listOf(x, y - (1 * isBack))
        270 -> listOf(x - (1 * isBack), y)
        else -> listOf()
    }
}