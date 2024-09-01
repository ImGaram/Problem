package problems.silver.s5

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val case = readLine().toInt()
    val inputList = IntArray(case)
    val outputStr = StringBuilder()

    for (it in 0 until case) {
        inputList[it] = readLine().toInt()
    }

    Arrays.sort(inputList)
    for (it in inputList) {
        outputStr.append(it).append("\n")
    }

    println(outputStr)
}