package problems.silver.s2

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.sqrt

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val n = bf.readLine()
    var rotate = ""

    for (i in n.length - 1 downTo 0) {
        val num = n[i].digitToInt()

        rotate += when (num) {
            0, 2, 5, 8, 1 -> num
            6 -> 9
            9 -> 6
            3, 4, 7 -> {
                println("no")
                return
            }
            else -> {
                println("no")
                return
            }
        }
    }

    if (check(n.toLong()) && check(rotate.toLong())) println("yes")
    else println("no")
}

private fun check(n: Long): Boolean {
    if (n == 1L) return false
    for (i in 2 .. sqrt(n.toDouble()).toInt()) {
        if (n % i == 0L) return false
    }
    return true
}