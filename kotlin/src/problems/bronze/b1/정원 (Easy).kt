package problems.bronze.b1

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (w, h) = readLine().split(" ").map { it.toInt() }
    val widthFlowers = readLine().split(" ").map { it.toInt() }
    val heightFlowers = readLine().split(" ").map { it.toInt() }
    val garden = Array(h + 1) { Array(w + 1) { 0 } }

    for (i in widthFlowers.indices) {
        garden[0][i+1] = widthFlowers[i]
    }

    for (i in heightFlowers.indices) {
        garden[i+1][0] = heightFlowers[i]
    }

    for (gh in 1 until garden.size) {
        for (gw in 1 until garden[gh].size) {
            val leftFlower = garden[gh][gw - 1]
            val topFlower = garden[gh - 1][gw]
            garden[gh][gw] = if (topFlower == leftFlower) 0 else 1
        }
    }

    println(garden[h][w])
}