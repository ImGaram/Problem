package src.problems.silver

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var weight = readLine().toInt()
    var cnt = 0

    while (weight >= 3) {
        if (weight % 5 != 0) {
            weight -= 3
            cnt++
        } else {
            val div = weight / 5
            weight -= 5 * div
            cnt += div
        }
    }

    if (weight != 0) println(-1)
    else println(cnt)
}