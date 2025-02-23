package problems.silver.s3

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.floor

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val (n, k, c, r) = bf.readLine().split(" ").map { it.toInt() }
    val base = bf.readLine().split(" ").map { it.toInt() }
    val s = bf.readLine().split(" ").map { it.toInt() }
    val p = bf.readLine().split(" ").map { it.toInt() }

    var fatigue = 0
    var combo = 0
    var stardust: Long = 0
    val skill = Array(k) { 0 }
    for (ni in 0 until n) {
        val l = bf.readLine().toInt()

        if (l == 0) {
            fatigue -= r
            if (fatigue < 0) fatigue = 0
            combo = 0
        } else {
            fatigue += p[l - 1]
            if (fatigue > 100) {
                stardust = -1
                break
            }

            val cnt = base[l - 1].toLong() * (100 + combo * c) * (100 + skill[l - 1] * s[l - 1]) / 10000
            stardust += cnt

            skill[l - 1]++
            combo++
        }
    }

    println(stardust)
}