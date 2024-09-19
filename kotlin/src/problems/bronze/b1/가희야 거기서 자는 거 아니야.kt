package problems.bronze.b1

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (roomH, roomW) = readLine().split(" ").map { it.toInt() }
    val (dogH, dogW, pillowH, pillowW) = readLine().split(" ").map { it.toInt() }
    var pTotalCnt = 0

    for (i in 0 until roomH) {
        val roomInput = readLine()
        pTotalCnt += roomInput.filter { it == 'P' }.length
    }

    if (pTotalCnt < pillowW * pillowH) println(1)
    else println(0)
}