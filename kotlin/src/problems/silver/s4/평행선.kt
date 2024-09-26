package problems.silver.s4

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val points = readLine().toInt()
    val xMap = mutableMapOf<Int, Int>()
    val yMap = mutableMapOf<Int, Int>()

    for (i in 0 until points) {
        val (coordinateX, coordinateY) = readLine().split(" ").map { it.toInt() }

        if (!xMap.containsKey(coordinateX)) xMap[coordinateX] = 1
        else xMap[coordinateX] = xMap[coordinateX]!! + 1

        if (!yMap.containsKey(coordinateY)) yMap[coordinateY] = 1
        else yMap[coordinateY] = yMap[coordinateY]!! + 1
    }

    var answer = 0
    for (x in xMap) {
        if (x.value >= 2) answer++
    }

    for (y in yMap) {
        if (y.value >= 2) answer++
    }
    println(answer)
}