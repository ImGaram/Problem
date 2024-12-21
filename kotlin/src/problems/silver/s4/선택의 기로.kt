package problems.silver.s4

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val n = bf.readLine().toInt()

    val miniature = mutableListOf<Pair<Int, Int>>()
    for (i in 0 until n) {
        val (q, p) = bf.readLine().split(" ").map { it.toInt() }

        miniature.add(Pair(q, p))
    }

    miniature.sortBy { it.second }
    miniature.sortByDescending { it.first }
    println("${miniature[0].first} ${miniature[0].second} ${miniature[1].first} ${miniature[1].second}")

    miniature.sortByDescending { it.first }
    miniature.sortBy { it.second }
    println("${miniature[0].first} ${miniature[0].second} ${miniature[1].first} ${miniature[1].second}")
}