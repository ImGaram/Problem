package problems.silver.s5

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    readLine()
    val bracelet = readLine().split(" ").map { it.toInt() }

    println((bracelet.max() - bracelet.min()) * 2)
}