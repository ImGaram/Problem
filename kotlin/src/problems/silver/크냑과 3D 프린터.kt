package problems.silver

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val cnt = readLine().toInt()
    val height = readLine().split(" ").map { it.toLong() }
    var surfaceArea: Long = height.sum() * 2 + cnt * 2 + height.first() + height.last()

    for (i in 0 until cnt - 1) {
        surfaceArea += abs(height[i] - height[i + 1])
    }

    println(surfaceArea)
}