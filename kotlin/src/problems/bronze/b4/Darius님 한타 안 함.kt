package problems.bronze.b4

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val (k, d, a) = bf.readLine().split("/").map { it.toInt() }

    if (k + a < d || d == 0) println("hasu")
    else println("gosu")
}