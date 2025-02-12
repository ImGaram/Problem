package problems.silver.s5

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val t = bf.readLine().toInt()

    for (ti in 0 until t) {
        val (a, b) = bf.readLine().split(" ").map { it.toInt() }

        println("yes")
    }
}