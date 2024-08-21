package problems.bronze

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.pow

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var (step, cherry) = readLine().split(" ").map { it.toInt() }
    var watermelon = 0

    while (cherry >= 2.0.pow(step - 1)) {
        cherry -= 2.0.pow(step - 1).toInt()
        watermelon++
    }

    println(watermelon)
}