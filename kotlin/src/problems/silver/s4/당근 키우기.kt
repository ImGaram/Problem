package problems.silver.s4

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val (x, y) = bf.readLine().split(" ").map { it.toInt() }

    println(x + y + min(x, y) / 10)
}