package problems.silver.s5

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val width = readLine().toInt()
    val removeCase = readLine().toInt()

    for (i in 0 until removeCase) {
        var (x, y) = readLine().split(" ").map { it.toInt() }

        if (x > (width+1) / 2) {
            x = width + 1 - x
        }
        if (y > (width+1) / 2) {
            y = width + 1 - y
        }
        if (x < y) {
            val move = x
            x = y
            y = move
        }

        if (y % 3 == 1) println(1)
        if (y % 3 == 2) println(2)
        if (y % 3 == 0) println(3)
    }
}