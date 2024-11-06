package problems.bronze.b2

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val t = bf.readLine().toInt()

    for (i in 0 until t) {
        val (a, b, c) = bf.readLine().split(" ").map { it.toLong() }
        val areas = listOf(
            a * a + (b + c) * (b + c),
            b * b + (a + c) * (a + c),
            c * c + (a + b) * (a + b)
        )

        println(areas.min())
    }
}