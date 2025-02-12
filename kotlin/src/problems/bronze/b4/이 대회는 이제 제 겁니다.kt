package problems.bronze.b4

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val (a, p, c) = bf.readLine().split(" ").map { it.toInt() }

    println(max(a + c, p))
}