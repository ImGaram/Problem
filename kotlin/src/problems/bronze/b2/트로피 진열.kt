package problems.bronze.b2

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    val trophies = mutableListOf<Int>()

    for (i in 0 until n) {
        trophies.add(readLine().toInt())
    }

    var currentMaxLeft = trophies[0]
    var left = 1
    for (i in 1 until trophies.size) {
        if (currentMaxLeft < trophies[i]) {
            left++
            currentMaxLeft = trophies[i]
        }
    }

    var currentMaxRight = trophies.last()
    var right = 1
    for (i in trophies.lastIndex - 1 downTo 0) {
        if (currentMaxRight < trophies[i]) {
            right++
            currentMaxRight = trophies[i]
        }
    }

    println(left)
    println(right)
}