package problems.silver.s5

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (r, c) = readLine().split(" ").map { it.toInt() }
    val relicCnt = readLine().toInt()
    val relics = mutableMapOf<Int, MutableList<List<Int>>>()

    for (i in 0 until relicCnt) {
        val (relicsNumber, w, h) = readLine().split(" ").map { it.toInt() }

        if (!relics.containsKey(relicsNumber)) {
            relics[relicsNumber] = mutableListOf(listOf(w, h))
        } else {
            relics[relicsNumber]?.add(listOf(w, h))
        }
    }

    var answer = Pair(0, 0L)
    for (relic in relics) {
        val area = getArea(relic.value)
        if (answer.second < area) {
            answer = Pair(relic.key, area)
        } else if (answer.second == area && answer.first > relic.key) {
            answer = Pair(relic.key, area)
        }
    }

    println("${answer.first} ${answer.second}")
}

private fun getArea(relicLocation: MutableList<List<Int>>): Long {
    var wMax = 0
    var wMin = Int.MAX_VALUE

    var hMax = 0
    var hMin = Int.MAX_VALUE

    for (location in relicLocation) {
        if (location[0] > wMax) wMax = location[0]
        if (location[0] < wMin) wMin = location[0]

        if (location[1] > hMax) hMax = location[1]
        if (location[1] < hMin) hMin = location[1]
    }

    return (wMax - wMin + 1) * (hMax - hMin + 1).toLong()
}