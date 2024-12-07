package problems.silver.s4

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs
import kotlin.math.min

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val n = bf.readLine().toInt()
    val pointColors = mutableListOf<Pair<Int, Int>>()
    var answer = 0

    for (i in 0 until n) {
        val (point, color) = bf.readLine().split(" ").map { it.toInt() }
        pointColors.add(Pair(point, color))
    }

    pointColors.sortBy { it.first }
    for (i in 0 until n) {
        val color = pointColors[i].second
        var indexFront: Int? = null
        var indexBack: Int? = null

        for (j in i + 1 until n) {
            if (pointColors[j].second == color) {
                indexFront = j
                break
            }
        }

        for (j in i - 1 downTo 0) {
            if (pointColors[j].second == color) {
                indexBack = j
                break
            }
        }

        val distanceFront = if (indexFront == null) Int.MAX_VALUE else abs(pointColors[i].first - pointColors[indexFront].first)
        val distanceBack = if (indexBack == null) Int.MAX_VALUE else abs(pointColors[i].first - pointColors[indexBack].first)

        answer += min(distanceFront, distanceBack)
    }

    println(answer)
}