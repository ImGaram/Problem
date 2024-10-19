package problems.silver.s4

import java.io.BufferedReader
import java.io.InputStreamReader

private const val mod = 1000000007

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val n = bf.readLine().toInt()

    println("${fibonacci(n)} ${n - 2}")
}

private fun fibonacci(n: Int): Int {
    var current = 1
    var before1 = 1
    var before2 = 0
    var temp: Int

    for (i in 3 .. n) {
        temp = current
        before2 = before1
        before1 = temp
        current = (before1 + before2) % mod
    }

    return current
}