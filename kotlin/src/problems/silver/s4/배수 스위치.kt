package problems.silver.s4

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val electricBulb = readLine().map { it.toString() }
    val bulbs = mutableListOf("0")
    bulbs.addAll(electricBulb)

    var switchClick = 0
    for (i in 1 until bulbs.size) {
        if (bulbs[i] == "N") continue
        else {
            for (c in i until bulbs.size step i) {
                bulbs[c] = if (bulbs[c] == "Y") "N" else "Y"
            }
            switchClick++
        }

        if (!bulbs.contains("Y")) break
    }

    if (bulbs.contains("Y")) println(-1)
    else println(switchClick)
}