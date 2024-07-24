package problems.bronze

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val maxScores = listOf(100, 100, 200, 200, 300, 300, 400, 400, 500)
    val score = readLine().split(" ").map { it.toInt() }
    var result = "draw"

    if (score.sum() < 100) {
        result = "none"
    }

    for (i in maxScores.indices) {
        if (maxScores[i] < score[i]) {
            result = "hacker"
            break
        }
    }

    println(result)
}