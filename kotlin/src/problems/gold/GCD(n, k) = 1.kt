package problems.gold

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.sqrt

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var number = readLine().toLong()

    var res = number
    for (i: Long in 2 .. sqrt(number.toDouble()).toLong()) {
        if (number % i == 0L) {
            res -= res / i
            while (number % i == 0L) number /= i
        }
    }

    if (number > 1) res -= res / number
    println(res)
}