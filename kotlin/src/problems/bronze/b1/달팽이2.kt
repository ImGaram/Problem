package problems.bronze.b1

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (h, w) = readLine().split(" ").map { it.toInt() }
    val map = Array(h) { BooleanArray(w) }
    val moveX = listOf(1, 0, -1, 0)
    val moveY = listOf(0, 1, 0, -1)
    var res = 0

    map[0][0] = true

    var currentX = 0
    var currentY = 0
    var m = 0

    while (true) {
        while (currentY in map.indices && currentX in 0 until map[currentY].size) {
            val mx = moveX[m] + currentX
            val my = moveY[m] + currentY

            if (my in map.indices && mx in 0 until map[my].size) {
                if (!map[my][mx]) {
                    map[my][mx] = true

                    currentX = mx
                    currentY = my
                } else break

            } else break
        }

        val afterMove = if (m == 3) 0 else m + 1
        val afterX = currentX + moveX[afterMove]
        val afterY = currentY + moveY[afterMove]

        if (afterY in map.indices && afterX in 0 until map[0].size && !map[afterY][afterX]) {
            res++
            m = afterMove
        } else break
    }

    println(res)
}