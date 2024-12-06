package problems.silver.s5

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val (h, w) = bf.readLine().split(" ").map { it.toInt() }
    val map = Array(h) { Array(w) { -1 } }
    val answer = StringBuilder()

    for (i in 0 until h) {
        val skyLine = bf.readLine().map { it.toString() }
        var movement = -1

        for (j in skyLine.indices) {
            val sky = skyLine[j]
            if (sky == "c") {
                movement = 0
            } else {
                if (movement != -1) movement++
            }
            map[i][j] = movement
        }

        answer.append("${map[i].joinToString(" ")}\n")
    }

    println(answer)
}