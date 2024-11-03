package problems.silver.s4

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val n = bf.readLine().toInt()

    val answer = mutableSetOf("ChongChong")
    for (i in 0 until n) {
        val (a, b) = bf.readLine().split(" ")

        if (answer.contains(a)) {
            answer.add(b)
        } else if (answer.contains(b)) {
            answer.add(a)
        }
    }

    println(answer.size)
}