package problems.silver.s4

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.floor

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val n = bf.readLine().toInt()
    val s = bf.readLine().split(" ").map { it.toDouble() }

    val status = Array(n) { Array(2) { 0 } }
    for (si in s.indices) {
        val num = floor(s[si]).toInt()
        val decimal = (s[si] * 10).toInt() % 10

        if (decimal == 0) {
            status[si][0] = num
            status[si][1] = 0
        } else {
            status[si][0] = num
            status[si][1] = 1
        }
    }

    var click = status[0].sum()
    for (i in 1 until status.size) {
        if (click == 0 && status[i][1] == 1) click++
        click += status[i][0]
    }

    println(click)
}