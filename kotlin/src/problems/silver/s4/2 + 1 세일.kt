package problems.silver.s4

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val n = bf.readLine().toInt()
    val prices = mutableListOf<Int>()

    for (ni in 0 until n) {
        val c = bf.readLine().toInt()
        prices.add(c)
    }
    prices.sortDescending()

    var answer = 0
    for (i in prices.indices) {
        if (i % 3 != 2) answer += prices[i]
    }
    println(answer)
}