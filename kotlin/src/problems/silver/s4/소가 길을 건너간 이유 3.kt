package problems.silver.s4

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val cowCnt = readLine().toInt()
    val cowList = mutableListOf<List<Int>>()

    for (i in 0 until cowCnt) {
        cowList.add(readLine().split(" ").map { it.toInt() })
    }

    var time = 0
    cowList.sortBy { it[0] }
    for (cow in cowList) {
        val enterTime = cow[0]
        val checkTime = cow[1]

        if (time <= enterTime) {
            time = enterTime + checkTime
        } else {
            time += checkTime
        }
    }

    println(time)
}