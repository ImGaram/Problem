package problems.bronze.b3

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val t = bf.readLine().toInt()

    for (i in 0 until t) {
        val (n, k) = bf.readLine().split(" ").map { it.toInt() }
        val candy = bf.readLine() .split(" ").map { it.toInt() }
        var sum = 0

        for (j in candy.indices) {
            sum += candy[j] / k
        }

        println(sum)
    }
}