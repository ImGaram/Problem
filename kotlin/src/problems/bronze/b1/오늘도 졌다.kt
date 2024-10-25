package problems.bronze.b1

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val oj = bf.readLine().split(" ").map { it.toInt() }
    val sg = bf.readLine().split(" ").map { it.toInt() }

    var scoreOj = 0
    var scoreSg = 0
    var answer = "No"

    for (i in 0 until 9) {
        scoreOj += oj[i]
        if (scoreOj > scoreSg) answer = "Yes"

        scoreSg += sg[i]
        if (scoreOj > scoreSg) answer = "Yes"
    }

    println(answer)
}