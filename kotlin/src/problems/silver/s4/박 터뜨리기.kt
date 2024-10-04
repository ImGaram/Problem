package problems.silver.s4

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (balls, baskets) = readLine().split(" ").map { it.toInt() }
    var minBallCnt = 0

    for (i in 1 .. baskets) {
        minBallCnt += i
    }

    if (balls < minBallCnt) println(-1)
    else if ((balls - minBallCnt) % baskets == 0) println(baskets - 1)
    else println(baskets)
}