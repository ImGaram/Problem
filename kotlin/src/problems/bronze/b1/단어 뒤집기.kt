package problems.bronze.b1

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val case = readLine().toInt()
    val sb = StringBuilder()

    for (i in 0 until case) {
        val string = readLine().split(" ")

        for (s in string) {
            sb.append("${s.reversed()} ")
        }
        sb.append("\n")
    }

    println(sb)
}