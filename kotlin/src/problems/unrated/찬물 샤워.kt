package problems.unrated

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (n, k, t) = readLine().split(" ").map { it.toInt() }
    val d = readLine().split(" ").map { it.toInt() }

    var currentTemperature = t
    var discomfortIndex = 0
    for (i in 0 until n) {
        if (currentTemperature < k) {
            currentTemperature += d[i] + abs(currentTemperature - k)
        } else if (currentTemperature > k) {
            currentTemperature = currentTemperature + d[i] - abs(currentTemperature - k)
        } else {
            currentTemperature += d[i]
        }

        discomfortIndex += abs(currentTemperature - k)
    }

    println(discomfortIndex)
}