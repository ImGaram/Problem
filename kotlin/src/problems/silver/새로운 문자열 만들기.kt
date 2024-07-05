package problems.silver

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val case = readLine().toInt()

    for (i in 0 until case) {
        val str = readLine()
        val reversedStr = str.reversed()
        var cutting = ""

        for (c in str.length - 1 downTo 0) {
            val subStr = str.substring(c, str.length)
            val subReversedStr = reversedStr.substring(0, str.length - c)

            if (subStr == subReversedStr) cutting = subReversedStr
        }

        println(str + reversedStr.substring(cutting.length, reversedStr.length))
    }
}