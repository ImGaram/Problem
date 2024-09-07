package problems.silver.s5

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (w, h, n) = readLine().split(" ").map { it.toDouble() }
    var result = if (n % 2 == 0.0) {
        (n - 2) / 4
    } else {
        (n - 1) * (n - 1) / (4 * n)
    }
    result *= 2 * h

    val format = String.format("%.6f", result)
    println(format)
}