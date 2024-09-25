package problems.bronze.b5

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val byte = readLine().toInt()
    var answer = ""

    repeat(byte / 4) {
        answer += "long "
    }

    println("${answer}int")
}