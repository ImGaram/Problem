package problems.silver.s1

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val n = bf.readLine().toInt()
    val procession = mutableListOf<List<Int>>()

    for (i in 0 until n) {
        val rc = bf.readLine().split(" ").map { it.toInt() }
        procession.add(rc)
    }

    var answer: Long = 0
    for (i in procession.lastIndex downTo 1) {
        answer += procession[i - 1][0].toLong() * procession[i - 1][1] * procession[n - 1][1]
    }

    println(answer)
}