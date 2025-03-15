package problems.silver.s4

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val (n, m) = bf.readLine().split(" ").map { it.toInt() }
    val prefer = mutableListOf<List<Int>>()

    for (ni in 0 until n) {
        val chicken = bf.readLine().split(" ").map { it.toInt() }
        prefer.add(chicken)
    }

    var res = 0
    for (i in 0 until m - 2) {
        for (j in i + 1 until m - 1) {
            for (k in j + 1 until m) {
                var ts = 0

                for (mi in 0 until n) {
                    ts += maxOf(prefer[mi][i], prefer[mi][j], prefer[mi][k])
                }
                res = max(res, ts)
            }
        }
    }

    println(res)
}