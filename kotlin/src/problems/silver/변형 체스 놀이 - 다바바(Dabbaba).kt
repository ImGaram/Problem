package problems.silver

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (map, case) = readLine().split(" ").map { it.toInt() }
    val pieces = hashSetOf<List<Int>>()
    val moveResultSet = hashSetOf<List<Int>>()

    val mx = listOf(-2, 2, 0, 0)
    val my = listOf(0, 0, -2, 2)
    for (i in 0 until case) {
        val piece = readLine().split(" ").map { it.toInt() }
        pieces.add(piece)

        val x = piece[0]
        val y = piece[1]
        for (j in mx.indices) {
            val nx = x + mx[j]
            val ny = y + my[j]

            if (nx in 1 .. map && ny in 1 .. map) {
                moveResultSet.add(listOf(nx, ny))
            }
        }
    }

    println(moveResultSet.subtract(pieces).size)
}