package problems.silver.s4

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val n = bf.readLine().toInt()
    val list = bf.readLine().split(" ").map { it.toLong() }
    var numerator = 0L       // 분자
    var denominator = 1L     // 분모

    for (i in list.indices) {
        val gcd = gcd(denominator, list[i])
        denominator = (denominator * list[i]) / gcd
    }

    for (i in list.indices) {
        numerator += denominator / list[i]
    }

    val reduction = gcd(denominator, numerator)
    println("${denominator / reduction}/${numerator / reduction}")
}

private fun gcd(a: Long, b: Long): Long {
    return if (b == 0L) a
    else gcd(b, a % b)
}