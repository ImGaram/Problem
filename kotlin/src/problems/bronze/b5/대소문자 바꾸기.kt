package problems.bronze.b5

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val s = bf.readLine()
    val sb = StringBuilder()

    for (c in s) {
        val upperC = c.uppercaseChar()
        val lowerC = c.lowercaseChar()

        sb.append(if (c == upperC) lowerC else upperC)
    }

    println(sb)
}