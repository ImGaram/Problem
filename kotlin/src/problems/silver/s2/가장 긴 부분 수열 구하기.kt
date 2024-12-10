package problems.silver.s2

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val n = bf.readLine().toInt()
    val a = bf.readLine().split(" ").map { it.toInt() }
    var total = a.first()

    for (i in 1 until n) {
        total = total and a[i]
    }

    if (total == 0) {
        val b = Array(31) { 0 }

        for (i in a) {
            var k = 0
            val binary = i.toString(2).reversed()

            for (j in binary) {
                if (j == '1') {
                    b[k]++
                }

                k++
            }
        }

        println(b.max())
    } else println(n)
}