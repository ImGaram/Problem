package problems.silver.s4

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (x, y) = readLine().split(" ").map { it.toInt() }
    val rhythm = mutableListOf<Pair<Double, String>>()
    val sb = StringBuilder()

    for (i in 1 .. x) {
        rhythm.add(Pair(i.toDouble() / x, "x"))
    }

    for (i in 1 .. y) {
        rhythm.add(Pair(i.toDouble() / y, "y"))
    }

    rhythm.sortBy { it.first }
    var i = 0
    while (i < rhythm.size) {
        if (rhythm[i].first == rhythm[i + 1].first) {
            sb.append("3")
            i += 2
        } else {
            when (rhythm[i].second) {
                "x" -> sb.append("1")
                "y" -> sb.append("2")
            }
            i++
        }
    }

    println(sb)
}