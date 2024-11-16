package problems.silver.s5

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val (m, seed, x1, x2) = bf.readLine().split(" ").map { it.toInt() }

    for (a in 0 until m) {
        var c = 0
        while (c < m && ((seed - x1).toLong() * a + x2 - x1) % m == 0L) {
            if (((x1 + x2) % m).toLong() == (a * (seed + x1).toLong() + 2 * c) % m) {
                println("$a $c")
                return
            }

            c++
        }
    }
}