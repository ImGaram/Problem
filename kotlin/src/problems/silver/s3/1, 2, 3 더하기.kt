package problems.silver.s3

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val case = readLine().toInt()
    val sumArray = Array(12) { 0 }
    sumArray[1] = 1
    sumArray[2] = 2
    sumArray[3] = 4

    for (i in 0 until case) {
        val num = readLine().toInt()

        for (j in 4..num) sumArray[j] = sumArray[j - 1] + sumArray[j - 2] + sumArray[j - 3]
        println(sumArray[num])
    }
}