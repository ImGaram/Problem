package problems.bronze.b3

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val length = readLine().toInt()
    val string = readLine()

    if (string.contains("gori")) println("YES")
    else println("NO")
}