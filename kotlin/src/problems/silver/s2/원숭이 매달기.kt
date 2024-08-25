package problems.silver.s2

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val case = readLine().toInt()

    for (i in 0 until case) {
        val tree = readLine()
        var deep = 0
        var current = 0

        for (t in tree) {
            if (t == '[') current++
            else current--

            deep = max(deep, current)
        }

        var res: Long = 1
        for (j in 0 until deep) res *= 2

        println(res)
    }
}