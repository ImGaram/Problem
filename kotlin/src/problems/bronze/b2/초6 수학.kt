package problems.bronze.b2

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max
import kotlin.math.min

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val t = bf.readLine().toInt()

    for (i in 0 until t) {
        val (a, b) = bf.readLine().split(" ").map { it.toInt() }
        var ga = max(a, b)
        var gb = min(a, b)

        while (ga % gb != 0) {
            val r = ga % gb
            ga = gb
            gb = r
        }

        val gcd = gb
        println("${a * b / gcd} $gcd")
    }
}