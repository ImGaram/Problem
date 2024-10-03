package problems.silver.s5

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (ad, targetWinningBid) = readLine().split(" ").map { it.toInt() }
    val adList = mutableListOf<List<Int>>()

    for (i in 0 until ad) {
        val adInfo = readLine().split(" ").map { it.toInt() }
        adList.add(adInfo)
    }

    adList.sortBy { it[1] - it[0] }
    val upperPrice = adList[targetWinningBid - 1][1] - adList[targetWinningBid - 1][0]
    if (upperPrice > 0) println(upperPrice)
    else println(0)
}