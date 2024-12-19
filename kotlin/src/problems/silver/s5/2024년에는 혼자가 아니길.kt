package problems.silver.s5

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val (x, y) = bf.readLine().split(" ").map { it.toInt() }

    if (y < x || 2 * x < y) print(-1)
    else print(1012 * x - 506 * y)
}