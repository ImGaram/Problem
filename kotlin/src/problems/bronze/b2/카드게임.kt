package problems.bronze.b2

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val cardA = readLine().split(" ").map { it.toInt() }
    val cardB = readLine().split(" ").map { it.toInt() }

    var aWinCnt = 0
    var bWinCnt = 0
    for (i in cardA.indices) {
        if (cardA[i] > cardB[i]) aWinCnt++
        else if (cardA[i] < cardB[i]) bWinCnt++
    }

    if (aWinCnt > bWinCnt) println("A")
    else if (aWinCnt < bWinCnt) println("B")
    else println("D")
}