package problems.bronze.b2

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val n = bf.readLine().toInt()

    val candidates = mutableListOf<List<String>>()
    for (ni in 0 until n) {
        val candidacy = bf.readLine().split(" ")
        candidates.add(candidacy)
    }

    candidates.sortBy { it[0] }
    candidates.sortByDescending { it[1].toInt() }

    println(candidates[0][0])
}