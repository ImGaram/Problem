package problems.bronze.b1

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    val d = readLine().split(" ").map { it.toInt() }

    println("YES")
    println(d.last() * 111)
}