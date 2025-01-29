package problems.bronze.b1

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val (n, l, h) = bf.readLine().split(" ").map { it.toInt() }
    val score = bf.readLine().split(" ").map { it.toInt() }.toMutableList()
    score.sort()

    for (i in 0 until l) {
        score.removeFirst()
    }

    for (i in 0 until h) {
        score.removeLast()
    }

    println(score.sum() / score.size.toDouble())
}