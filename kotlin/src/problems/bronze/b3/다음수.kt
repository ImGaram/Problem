package problems.bronze.b3

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))

    while (true) {
        val (n1, n2, n3) = bf.readLine().split(" ").map { it.toInt() }

        if (n1 == 0 && n2 == 0 && n3 == 0) break

        if (n2 - n1 == n3 - n2) {
            println("AP ${n3 + (n3 - n2)}")
        } else {
            println("GP ${n3 * (n3 / n2)}")
        }
    }
}