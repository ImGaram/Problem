package src.problems.silver

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val case = readLine().toInt()
    val coordinateList = Array(case) { arrayOf(0, 0) }

    for (i in 0 until case) {
        val coordinateInput = readLine().split(" ").map { it.toInt() }
        coordinateList[i][0] = coordinateInput[0]
        coordinateList[i][1] = coordinateInput[1]
    }

    coordinateList.sortWith(compareBy({it[0]}, {it[1]}))

    val result = StringBuilder()
    for (i in coordinateList) {
        result.append("${i[0]} ${i[1]}").append("\n")
    }

    println(result)
}