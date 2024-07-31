package problems.bronze

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (point1, point2) = readLine().split(" ").map { it.toInt() }
    val point1Location = mutableListOf<Int>()
    val point2Location = mutableListOf<Int>()

    if (point1 % 4 == 0) {
        point1Location.add(point1 / 4)
        point1Location.add(4)
    } else {
        point1Location.add(point1 / 4 + 1)
        point1Location.add(point1 % 4)
    }

    if (point2 % 4 == 0) {
        point2Location.add(point2 / 4)
        point2Location.add(4)
    } else {
        point2Location.add(point2 / 4 + 1)
        point2Location.add(point2 % 4)
    }

    println(abs(point1Location[0] - point2Location[0]) + abs(point1Location[1] - point2Location[1]))
}