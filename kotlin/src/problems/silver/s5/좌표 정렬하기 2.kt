package problems.silver.s5

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val case = readLine().toInt()
    val coordinateList = Array(case) { arrayOf(0, 0) }

    for (i in 0 until case) {
        val input = readLine().split(" ").map { it.toInt() }
        coordinateList[i][0] = input[0]
        coordinateList[i][1] = input[1]
    }

    coordinateList.sortBy { it[0] }     // x축으로 정렬하기
    coordinateList.sortBy { it[1] }     // y축으로 정렬하기

    val result = StringBuilder()
    for (it in coordinateList) {
        result.append("${it[0]} ${it[1]}").append("\n")
    }
    println(result)
}