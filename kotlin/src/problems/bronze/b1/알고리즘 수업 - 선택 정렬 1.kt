package problems.bronze.b1

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (size, cnt) = readLine().split(" ").map { it.toInt() }
    val list = readLine().split(" ").map { it.toInt() }.toTypedArray()
    var changeCnt = 0

    var changeIndex = list.lastIndex
    for (v in size downTo 2) {
        var maxIndex = 0
        for (i in 0 until v) {
            if (list[maxIndex] < list[i]) maxIndex = i
        }

        if (maxIndex != changeIndex) {
            val temp = list[maxIndex]
            list[maxIndex] = list[changeIndex]
            list[changeIndex] = temp

            changeCnt++

            if (changeCnt == cnt) {
                println("${list[maxIndex]} ${list[changeIndex]}")
            }
        }

        changeIndex--
    }

    if (changeCnt < cnt) println(-1)
}