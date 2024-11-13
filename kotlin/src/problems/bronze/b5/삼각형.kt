package problems.bronze.b5

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val (w, h) = bf.readLine().split(" ").map { it.toDouble() }

    println(w * h / 2)
}