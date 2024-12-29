package problems.silver.s5

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs
import kotlin.math.min
import kotlin.math.sqrt

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val y = bf.readLine().split(" ").map { it.toInt() }
    val a = bf.readLine().split(" ").map { it.toInt() }
    val b = bf.readLine().split(" ").map { it.toInt() }
    val c = bf.readLine().split(" ").map { it.toInt() }
    val person = listOf(a, b, c)
    var answer = Int.MAX_VALUE

    for (i in person.indices) {
        for (j in person.indices) {
            if (j == i) continue

            for (k in person.indices) {
                if (k == i) continue
                if (k == j) continue

                val d = getDistance(y, person[i]) + getDistance(person[i], person[j]) + getDistance(person[j], person[k])
                answer = min(answer, d.toInt())
            }
        }
    }

    println(answer)
}

private fun getDistance(c1: List<Int>, c2: List<Int>): Double {
    val dx = abs(c1[0] - c2[0])
    val dy = abs(c1[1] - c2[1])
    return sqrt(dx * dx + dy * dy + 0.0)
}