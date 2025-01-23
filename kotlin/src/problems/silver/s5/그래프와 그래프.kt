package problems.silver.s5

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val (a, b, c) = bf.readLine().split(" ").map { it.toInt() }

    val answer = Array(11) { mutableListOf<Int>() }
    for (x in 1 .. 10) {

        for (y in 1 .. 10) {
            if ((a * x) + (b * y) == c) answer[x].add(y)
        }

        if (answer[x].isEmpty()) println(0)
        else println(answer[x].joinToString(" "))
    }
}