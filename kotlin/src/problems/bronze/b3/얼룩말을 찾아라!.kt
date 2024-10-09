package problems.bronze.b3

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (n, l) = readLine().split(" ").map { it.toInt() }
    val blackLine = mutableListOf<Int>()

    for (i in 0 until n) {
        val horse = readLine()
        var black = 0
        var newBlack = true

        for (c in horse) {
            when (c) {
                '0' -> {
                    newBlack = true
                }
                '1' -> {
                    if (newBlack){
                        black++
                        newBlack = false
                    }
                }
            }
        }

        blackLine.add(black)
    }

    val max = blackLine.max()
    println("$max ${blackLine.count { it == max }}")
}