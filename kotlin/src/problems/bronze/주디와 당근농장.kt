package problems.bronze

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (n, r, c) = readLine().split(" ").map { it.toInt() }
    val map = Array(n + 1) { Array(n + 1) { "." } }
    val res = StringBuilder()

    map[r][c] = "v"

    for (i in 1 until map.size) {
        for (j in 1 until map[i].size) {
            if (abs(r - i) % 2 == 0) {
                if (abs(c - j) % 2 == 0) map[i][j] = "v"
            } else {
                if (abs(c - j) % 2 != 0) map[i][j] = "v"
            }
        }

        res.append("${map[i].filterIndexed { index, _ -> index != 0 }.joinToString("")}\n")
    }

    println(res)
}