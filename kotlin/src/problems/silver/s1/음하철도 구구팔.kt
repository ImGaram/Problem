package problems.silver.s1

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val (xs, ys) = bf.readLine().split(" ").map { it.toInt() }
    var (xe, ye, dx, dy) = bf.readLine().split(" ").map { it.toInt() }

    val gcd = gcd(dx, dy)
    dx /= gcd
    dy /= gcd

    var minD = Int.MAX_VALUE
    var answer = listOf(0, 0)
    while (true) {
        val d = getDistance(xe, ye, xs, ys)

        if (d >= minD) break

        minD = d
        answer = listOf(xe, ye)

        xe += dx
        ye += dy
    }

    println("${answer.first()} ${answer.last()}")
}

private fun gcd(a: Int, b: Int): Int {
    if (b != 0) return gcd(b, a % b)
    else return abs(a)
}

private fun getDistance(xe: Int, ye: Int, xs: Int, ys: Int): Int {
    return (xe - xs) * (xe - xs) + (ye - ys) * (ye - ys)
}