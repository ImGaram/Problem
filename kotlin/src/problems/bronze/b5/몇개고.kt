package problems.bronze.b5

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (time, alcohol) = readLine().split(" ").map { it.toInt() }

    if (time in 12 .. 16 && alcohol == 0) println(320)
    else println(280)
}