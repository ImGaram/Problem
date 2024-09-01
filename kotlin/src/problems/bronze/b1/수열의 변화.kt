package problems.bronze.b1

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (n, k) = readLine().split(" ").map { it.toInt() }
    var resultList = readLine().split(",").map { it.toInt() }

    for (i in 0 until k) {
        val changeList = mutableListOf<Int>()
        for (j in 0 until resultList.size - 1) {
            changeList.add(resultList[j+1] - resultList[j])
        }

        resultList = changeList
    }

    println(resultList.joinToString(","))
}