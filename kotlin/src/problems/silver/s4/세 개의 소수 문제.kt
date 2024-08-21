package problems.silver.s4

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.sqrt

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val case = readLine().toInt()

    for (c in 0 until case) {
        val num = readLine().toInt()
        val array = Array(num + 1) { it }
        array[1] = 0

        for (i in 2 .. sqrt(num.toDouble()).toInt()) {
            if (array[i] == 0) continue

            for (j in 2 * i .. num step i) {
                array[j] = 0
            }
        }

        val removeZeroArr = array.filter { it != 0 }
        var answer = ""
        for (i in removeZeroArr.size - 1 downTo 0) {
            for (j in removeZeroArr.size - 1 downTo 0) {
                for (k in removeZeroArr.size - 1 downTo 0) {
                    val sum = removeZeroArr[i] + removeZeroArr[j] + removeZeroArr[k]
                    if (sum == num) {
                        answer = "${removeZeroArr[i]} ${removeZeroArr[j]} ${removeZeroArr[k]}"
                        break
                    }
                }
            }
        }

        if (answer.isEmpty()) println(0)
        else println(answer)
    }
}