package problems.silver

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Arrays

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val case = readLine().toInt()
    val person = readLine().split(" ").map { it.toInt() }.toIntArray()

    Arrays.sort(person)

    val takeTimeList = mutableListOf(person[0])
    for (i in 1 until case) {
        takeTimeList.add(takeTimeList[i-1] + person[i])
    }

    println(takeTimeList.sum())
}