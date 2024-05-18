package src.problems.bronze

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    for (i in 0 until 100) {
        val text = readLine() ?: break
        println(text)
    }
}