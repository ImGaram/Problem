package problems.bronze.b1

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.pow

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val case = readLine().toInt()

    for (c in 0 until case) {
        val number = readLine().toLong()
        var y = 0
        var answer = listOf<Int>()

        while (2.0.pow(y) <= Long.MAX_VALUE) {
            var isNumber = false
            for (x in 0 .. y) {
                val result = pow(2, x) + pow(2, y)
                if (result == number) {
                    isNumber = true
                    answer = listOf(x, y)
                }
            }
            y++

            if (isNumber) {
                println(answer.joinToString(" "))
                break
            }
        }
    }
}

private fun pow(num: Int, degree: Int): Long {
    var result = 1L

    for (i in 1 .. degree) {
        result *= num
    }

    return result
}