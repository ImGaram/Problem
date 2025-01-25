package problems.silver.s1

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val (r, c, k) = bf.readLine().split(" ").map { it.toInt() }

    if (r % 2 == 1 && c % 2 == 1) {
        if (k != 1) println(0)
        else println(1)
    } else {
        println(1)
    }
}