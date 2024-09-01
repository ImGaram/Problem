package problems.silver.s5

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val allSquare = mutableListOf<List<Int>>()
    // 너비가 높이보다 커야 함.
    for (h in 1 .. 150) {
        for (w in h .. 150) {
            if (h == w) continue
            allSquare.add(listOf(h, w))
        }
    }
    allSquare.sortBy { it[0] }
    allSquare.sortBy { it[0] * it[0] + it[1] * it[1] }

    while (true) {
        val square = readLine().split(" ").map { it.toInt() }
        if (square == listOf(0, 0)) break

        val index = allSquare.indexOf(square)
        println(allSquare[index + 1].joinToString(" "))
    }
}