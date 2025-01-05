package problems.silver.s4

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val n = bf.readLine().toInt()
    val a = bf.readLine().split(" ").map { it.toInt() }.sorted()

    var max = 0
    var answer = -1

    for (i in 0 until n - 1) {
       val diff = (a[i + 1] - a[i]) / 2

        if (max < diff) {
            max = diff
            answer = (a[i + 1] + a[i]) / 2
        }
    }

    println(answer)
}