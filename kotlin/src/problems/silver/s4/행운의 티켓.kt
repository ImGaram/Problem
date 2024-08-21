package problems.silver.s4

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val ticket = readLine()
    var result = 0

    for (size in 1 until ticket.length / 2 + 1) {

        for (i in 0 until ticket.length - size) {
            if (i + size + size <= ticket.length) {
                val first = ticket.substring(i, size + i)
                val last = ticket.substring(i + size, i + size + size)
                val firstSum = first.sumOf { it.digitToInt() }
                val lastSum = last.sumOf { it.digitToInt() }

                if (firstSum == lastSum) result = max(result, first.length + last.length)
            }
        }
    }

    println(result)
}