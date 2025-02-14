package problems.silver.s4

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val (n, k) = bf.readLine().split(" ").map { it.toInt() }
    val s = bf.readLine()

    if ((n - k - 1) % 2 == 0) {
        println(s.substring(k - 1) + s.substring(0, k - 1))
    } else {
        println(s.substring(k - 1) + s.substring(0, k - 1).reversed())
    }
}