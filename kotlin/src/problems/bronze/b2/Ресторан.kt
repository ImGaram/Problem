package problems.bronze.b2

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val s = bf.readLine()
    var res = ""

    for (c in s) {
        val addS = when (c) {
            'B' -> "v"
            'E' -> "ye"
            'H' -> "n"
            'P' -> "r"
            'C' -> "s"
            'Y' -> "u"
            'X' -> "h"
            else -> c.lowercase()
        }

        res += addS
    }

    println(res)
}