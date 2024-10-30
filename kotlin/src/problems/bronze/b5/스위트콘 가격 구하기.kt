package problems.bronze.b5

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val b = bf.readLine().toInt()

    println(b - (b / 11))
}