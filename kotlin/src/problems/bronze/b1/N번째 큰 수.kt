package problems.bronze.b1

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Arrays

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val case = readLine().toInt()

    for (i in 0 until case) {
        val numArray = Array(10) { 0 }
        val inputList = readLine().split(" ").map { it.toInt() }
        for (j in numArray.indices) {
            numArray[j] = inputList[j]
        }

        Arrays.sort(numArray)
        println(numArray[7])
    }
}