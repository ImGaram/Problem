package problems.gold

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val code = readLine()
    val regex = Regex("(100+1+|01)+")

    if (regex.matches(code)) println("SUBMARINE")
    else println("NOISE")
}