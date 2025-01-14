package problems.silver.s2

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val n = bf.readLine().toInt()
    val h = bf.readLine().split(" ").map { it.toInt() }.toIntArray()
    val a = bf.readLine().split(" ").mapIndexed { i, data -> Pair(i, data.toInt()) }.toMutableList()
    a.sortBy { it.second }

    var answer: Long = 0
    for (i in a.indices) {
        // i = 곱해지는 수
        val index = a[i].first
        h[index] += (a[i].second * i)

        answer += h[index]
    }

    println(answer)
}