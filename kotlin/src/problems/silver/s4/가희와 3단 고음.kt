package problems.silver.s4

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val (n, a, d) = bf.readLine().split(" ").map { it.toLong() }
    val sounds = bf.readLine().split(" ").map { it.toLong() }
    var step = 0
    var checkSound: Long = a

    for (i in sounds.indices) {
        if (sounds[i] == checkSound) {
            step++
            checkSound += d
        }
    }

    println(step)
}