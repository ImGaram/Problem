package problems.gold

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.sqrt

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val case = readLine().toInt()

    for (i in 0 until case) {
        val (start, end) = readLine().split(" ").map { it.toInt() }
        val distance = end - start
        val max = sqrt(distance.toDouble()).toInt()

        if (max.toDouble() == sqrt(distance.toDouble())) println(max * 2 - 1)
        else if (distance in max * max + 1 .. (max * max) + max) println(max * 2)
        else println(max * 2 + 1)
    }
}