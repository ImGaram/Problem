package problems.bronze

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val case = readLine().toInt()

    for (i in 0 until case) {
        val (a, b) = readLine().split(" ").map { it.toInt() }
        var gcdA = a
        var gcdB = b

        while (gcdB != 0) {
            val res = gcdA % gcdB
            gcdA = gcdB
            gcdB = res
        }

        println(a * b / gcdA)
    }
}