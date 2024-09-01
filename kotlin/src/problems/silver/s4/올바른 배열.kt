package problems.silver.s4

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val size = readLine().toInt()
    val list = mutableListOf<Int>()

    for (i in 0 until size) {
        list.add(readLine().toInt())
    }
    list.sort()

    var consecutiveNumberCnt = 4
    for (start in 0 until list.size - 1) {
        var needCnt = 0
        var end = start + 1

        for (move in 1 until 5) {
            if (end in 0 until list.size) {
                if (list[end] != list[start] + move) needCnt++
                else end++
            } else {
                // 리스트의 범위를 벗어남. 그래서 수가 더 있어야 함.
                needCnt++
            }
        }

        consecutiveNumberCnt = min(consecutiveNumberCnt, needCnt)
    }

    println(consecutiveNumberCnt)
}