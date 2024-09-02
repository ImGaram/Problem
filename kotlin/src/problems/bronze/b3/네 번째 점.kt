package problems.bronze.b3

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val pointsX = mutableMapOf<Int, Int>()
    val pointsY = mutableMapOf<Int, Int>()

    for (i in 1 .. 3) {
        val point = readLine().split(" ").map { it.toInt() }
        if (!pointsX.containsKey(point[0])) pointsX[point[0]] = 1
        else pointsX[point[0]] = pointsX[point[0]]!! + 1

        if (!pointsY.containsKey(point[1])) pointsY[point[1]] = 1
        else pointsY[point[1]] = pointsY[point[1]]!! + 1
    }

    println("${pointsX.filter { it.value == 1 }.keys.first()} ${pointsY.filter { it.value == 1 }.keys.first()}")
}