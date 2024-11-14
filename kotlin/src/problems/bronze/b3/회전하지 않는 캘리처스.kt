package problems.bronze.b3

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val n = bf.readLine().toInt()
    val coordinate = mutableListOf<List<Int>>()

    for (i in 0 until n) {
        coordinate.add(bf.readLine().split(" ").map { it.toInt() })
    }

    println("${coordinate.maxOf { it[1] } - coordinate.minOf { it[1] }}")
}