package problems.bronze.b2

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val n = bf.readLine().toInt()
    val answer = StringBuilder()

    for (i in 0 until n) {
        val str = bf.readLine().split(" ")
        val yoda = mutableListOf<String>()

        for (s in str.indices) {
            if (s >= 2) yoda.add(s - 2, str[s])
            else yoda.add(str[s])
        }

        answer.append("${yoda.joinToString(" ")}\n")
    }

    println(answer)
}