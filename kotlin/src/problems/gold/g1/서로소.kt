package problems.gold.g1

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.sqrt

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        var number = readLine().toInt()
        if (number == 1) {
            bw.write("0\n")
            continue
        }
        if (number == 0) break

        var res = number
        for (i in 2 .. sqrt(number.toDouble()).toInt()) {
            if (number % i == 0) {
                res -= res / i
                while (number % i == 0) number /= i
            }
        }

        if (number > 1) res -= res / number
        bw.write("${res}\n")
    }

    bw.flush()
    bw.close()
}