package problems.silver.s5

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val (n, f) = bf.readLine().split(" ").map { it.toInt() }
    val (hh, hs, sh, ss) = bf.readLine().split(" ").map { it.toDouble() }

    var d = (1 - f) * 1000.0
    for (i in 0 until n) {
        d = d * hh + (1000 - d) * sh
    }

    println(String.format("%.0f", d))
    println(String.format("%.0f", 1000 - d))
}