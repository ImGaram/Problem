package problems.bronze.b3

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.sqrt

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    var i = 1
    val sb = StringBuilder()

    while (true) {
        val (a, b, c) = bf.readLine().split(" ").map { it.toDouble() }
        var res = "Impossible."

        if (a == 0.0 && b == 0.0 && c == 0.0) break

        if (i > 1) sb.append("\n\n")
        if (a == -1.0) {
            val newA = sqrt(c * c - b * b)

            if (newA > 0) {
                res = String.format("a = %.03f", newA)
            }
        } else if (b == -1.0) {
            val newB = sqrt(c * c - a * a)

            if (newB > 0) {
                res = String.format("b = %.03f", newB)
            }
        } else if (c == -1.0) {
            res = String.format("c = %.03f", sqrt(a * a + b * b))
        }

        sb.append("Triangle #$i\n$res")
        i++
    }

    println(sb)
}