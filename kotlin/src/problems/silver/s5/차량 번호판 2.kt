package problems.silver.s5

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val format = readLine()
    var answer: Long = 1
    var lastWord = '0'

    for (c in format) {
        when (c) {
            'c' -> {
                answer *= if (lastWord == 'c') 25 else 26
                lastWord = 'c'
            }
            'd' -> {
                answer *= if (lastWord == 'd') 9 else 10
                lastWord = 'd'
            }
        }

        answer %= 1000000009
    }

    println(answer)
}