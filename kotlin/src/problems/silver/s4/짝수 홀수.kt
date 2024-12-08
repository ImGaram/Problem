package problems.silver.s4

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.sqrt

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val n = bf.readLine().toInt()
    val x = bf.readLine().split(" ").map { it.toLong() }
    val answer = StringBuilder()

    for (i in x) {
        val sqrt = sqrt(i.toDouble()).toLong()
        if (sqrt * sqrt == i) answer.append("1 ")
        else answer.append("0 ")
    }

    println(answer)
}