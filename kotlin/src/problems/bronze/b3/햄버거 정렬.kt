package problems.bronze.b3

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val str = readLine()

    when (str) {
        ")1(" -> println(2)
        "(1)" -> println(0)
        else -> println(1)
    }
}