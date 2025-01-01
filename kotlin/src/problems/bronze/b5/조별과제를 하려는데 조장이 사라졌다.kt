package problems.bronze.b5

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val l = bf.readLine().toInt()

    if (l % 5 != 0) println(l / 5 + 1)
    else println(l / 5)
}