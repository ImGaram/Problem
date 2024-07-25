package problems.silver

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val case = readLine().toInt()
    var sec = 0

    for (i in 0 until case) {
        val bot = readLine().split(" ").map { it.toInt() }
        val searchTime = bot[1]

        if (sec == 0) {
            sec += searchTime + 1
            continue
        }

        if (sec % bot.sum() >= searchTime) {
            sec++
            continue
        } else {
            val wait = searchTime - (sec % bot.sum())
            sec += wait + 1
        }
    }

    println(sec)
}