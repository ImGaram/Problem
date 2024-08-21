package problems.silver.s3

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (h, w) = readLine().split(" ").map { it.toInt() }

    if (h == 1) println(1)
    else if (h == 2) println(min(4, (w + 1) / 2))
    else if (w < 7) println(min(4, w))
    else println(w - 2)
}