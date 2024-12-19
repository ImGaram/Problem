package problems.silver.s5

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val n = bf.readLine().toInt()
    var size = 1
    var answer = ""

    for (i in 1 .. n) {
        val number = mutableListOf(n, i)

        while (number[number.lastIndex - 1] - number[number.lastIndex] >= 0) {
            number.add(number[number.lastIndex - 1] - number[number.lastIndex])
        }

        size = max(size, number.size)
        if (size == number.size) {
            answer = number.joinToString(" ")
        }
    }

    println(size)
    println(answer)
}