package problems.bronze.b5

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val year = readLine().toInt()
    println(year - 1946)
}