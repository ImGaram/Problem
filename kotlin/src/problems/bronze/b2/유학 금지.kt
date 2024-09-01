package problems.bronze.b2

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val word = readLine()
    val censor = "CAMBRIDGE".map { it }

    for (i in word.indices) {
        if (censor.contains(word[i])) continue
        print(word[i])
    }
}