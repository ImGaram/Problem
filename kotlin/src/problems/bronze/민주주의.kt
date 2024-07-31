package problems.bronze

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (case, votes) = readLine().split(" ").map { it.toInt() }
    var majority = 0

    for (i in 0 until case) {
        var oCnt = 0
        val vote = readLine()

        for (c in vote) {
            if (c == 'O') oCnt++
        }

        if (oCnt > votes / 2) majority++
    }

    println(majority)
}