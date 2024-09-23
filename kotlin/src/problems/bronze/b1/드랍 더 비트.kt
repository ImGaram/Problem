package problems.bronze.b1

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max
import kotlin.math.pow

private var size = 0

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    size = readLine().toInt()
    val (a, b) = readLine().split(" ").map { it.toInt() }
    val aCases = mutableListOf<Int>()
    val bCases = mutableListOf<Int>()

    for (i in 0 until 2.0.pow(size).toInt()) {
        val value = format(i.toString(2))
        val oneCnt = value.filter { it == '1' }.length

        if (oneCnt == a) aCases.add(i)
        if (oneCnt == b) bCases.add(i)
    }

    var answer = 0
    for (i in 0 until aCases.size) {
        for (j in 0 until bCases.size) {
            answer = max(answer, aCases[i] xor bCases[j])
        }
    }

    println(answer)
}

private fun format(value: String): String {
    return value.padStart(size, '0')
}