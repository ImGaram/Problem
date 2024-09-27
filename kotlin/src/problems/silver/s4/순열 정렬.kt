package problems.silver.s4

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max
import kotlin.math.min

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val case = readLine().toInt()

    for (t in 0 until case) {
        val numCnt = readLine().toInt()
        val number = readLine().split(" ").map { it.toInt() }.toTypedArray()
        var answer = "YES"

        for (i in number.indices) {
            val minValue = min(number[i], numCnt - number[i] + 1)
            val maxValue = max(number[i], numCnt - number[i] + 1)

            if (i == 0) number[i] = minValue
            else {
                val prev = number[i - 1]
                if (prev <= minValue) number[i] = minValue
                else if (prev in (minValue + 1)..maxValue) number[i] = maxValue
                else {
                    answer = "NO"
                    break
                }
            }
        }

        println(answer)
    }
}