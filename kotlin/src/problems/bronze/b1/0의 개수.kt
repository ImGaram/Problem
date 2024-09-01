package problems.bronze.b1

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val case = readLine().toInt()

    for (i in 0 until case) {
        val (start, end) = readLine().split(" ").map { it.toInt() }
        var zeroCnt = 0

        for (n in start .. end) {
            for (c in n.toString()) {
                if (c == '0') zeroCnt++
            }
        }

        println(zeroCnt)
    }
}