package problems.silver.s4

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val case = readLine().toInt()
    for (i in 0 until case) {
        val num = readLine().split(" ").map { it.toLong() }
        val repeating = num.last()

        println("${num.first()} ${pisano(repeating)}")
    }
}

private fun pisano(m: Long): Long {
    var previous = 0L
    var current = 1L
    var mod: Long

    for (i: Long in 0 until m * m) {
        mod = (previous + current) % m
        previous = current
        current = mod

        if (previous == 0L && current == 1L) {
            return i + 1
        }
    }

    return 0
}