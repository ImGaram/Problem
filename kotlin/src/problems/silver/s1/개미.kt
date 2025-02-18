package problems.silver.s1

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max
import kotlin.math.min

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val n = bf.readLine().toInt()
    val sb = StringBuilder()

    for (ni in 0 until n) {
        val (stick, ant) = bf.readLine().split(" ").map { it.toInt() }
        var st = 0
        var lt = 0

        for (i in 0 until ant) {
            val local = bf.readLine().toInt()

            val s = min(local, stick - local)
            val l = max(local, stick - local)
            st = max(st, s)
            lt = max(lt, l)
        }

        sb.append("$st $lt\n")
    }

    println(sb)
}