package problems.gold.g2

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val modValue = 1000000
    val repeat = 15 * (modValue / 10)

    val size = readLine().toLong()
    val fibonacci = Array(repeat) { 0 }
    fibonacci[1] = 1

    for (i in 2 until 15 * (modValue / 10)) {
        fibonacci[i] = (fibonacci[i - 1] + fibonacci[i - 2]) % modValue
    }

    println(fibonacci[(size % repeat).toInt()])
}