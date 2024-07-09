package problems.silver

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs
import kotlin.math.min

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val checkpoints = readLine().toInt()
    val checkpointList = mutableListOf<List<Int>>()
    var distance = 0

    for (i in 0 until checkpoints) {
        val (x, y) = readLine().split(" ").map { it.toInt() }
        checkpointList.add(listOf(x, y))
        if (i > 0) {
            distance += manhattanDistance(checkpointList[i-1], listOf(x, y))
        }
    }

    var res = distance
    for (i in 1 until checkpoints - 1) {
        // i번째 좌표를 건너뛰고 이동한 거리.
        val without = distance - (manhattanDistance(checkpointList[i], checkpointList[i+1]) + manhattanDistance(checkpointList[i], checkpointList[i-1])) + manhattanDistance(checkpointList[i-1], checkpointList[i+1])

        res = min(without, res)
    }

    println(res)
}

private fun manhattanDistance(data1: List<Int>, data2: List<Int>): Int {
    return abs(data1[0] - data2[0]) + abs(data1[1] - data2[1])
}