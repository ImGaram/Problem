package problems.silver.s5

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val stone = readLine().toInt()

    if (stone % 2 == 0) println("CY")
    else println("SK")
}