package problems.bronze.b2

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val (n, m) = bf.readLine().split(" ").map { it.toInt() }
    val bus = bf.readLine().split(" ").map { it.toInt() }
    val price = Array(n + 1) { listOf<Int>() }

    for (i in 1 .. n) {
        val info = bf.readLine().split(" ").map { it.toInt() }.toMutableList()
        info.add(0, 0)
        price[i] = info
    }

    var answer = 0
    for (i in 0 until bus.size - 1) {
        answer += price[bus[i]][bus[i + 1]]
    }

    println(answer)
}