package problems.silver.s5

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val (n, r) = bf.readLine().split(" ").map { it.toLong() }

    println(n + 2 * r - 1)
}