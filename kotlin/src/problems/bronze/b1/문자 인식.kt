package problems.bronze.b1

import java.io.BufferedReader
import java.io.InputStreamReader
import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val n = bf.readLine().toInt()
    var text: List<String>

    for (i in 0 until n) {
        var total = 0
        var recongize = 0
        while (true) {
            text = bf.readLine().map { it.toString() }
            if (text.isEmpty()) break

            total += text.size
            for (t in text) {
                if (t != "#") recongize++
            }
        }

        val res = BigDecimal.valueOf(recongize.toDouble() / total * 100).setScale(1, RoundingMode.HALF_UP).stripTrailingZeros()
        println("Efficiency ratio is ${res.toPlainString()}%.")
    }
}