package problems.bronze.b2

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val case = readLine().toInt()
    val res = StringBuilder()

    for (i in 0 until case) {
        val num = readLine().toInt()

        if (num >= 3) res.append("3\n")
        else res.append("1\n")
    }

    println(res)
}