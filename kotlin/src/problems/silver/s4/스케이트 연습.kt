package problems.silver.s4

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val n = bf.readLine().toInt()
    val v = bf.readLine().split(" ").map { it.toInt() }
    var total: Long = 1
    var max = 1

    for (i in n - 2 downTo 0) {
        if (v[i] > max) max++
        else if (v[i] < max) max = v[i]

        total+= max
    }

    println(total)
}