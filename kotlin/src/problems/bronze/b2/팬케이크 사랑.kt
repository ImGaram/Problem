package problems.bronze.b2

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val t = bf.readLine().toInt()

    for (i in 0 until t) {
        bf.readLine()

        val (c, y, su, sa, f) = bf.readLine().split(" ").map { it.toInt() }
        val (b, gs, gc, w) = bf.readLine().split(" ").map { it.toInt() }

        val batter = listOf(
            (c / 0.5).toInt(),
            (y / 0.5).toInt(),
            (su / 0.25).toInt(),
            (sa / 0.0625).toInt(),
            (f / 0.5625).toInt()
        ).min()

        var pancake = 0
        pancake += b
        pancake += gs / 30
        pancake += gc / 25
        pancake += w / 10

        println(min(pancake, batter))
    }
}