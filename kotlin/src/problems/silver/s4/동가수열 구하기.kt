package problems.silver.s4

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val size = readLine().toInt()
    val sequence = mutableListOf<Int>()

    if (size == 1) {
        println(1)
        return
    }

    for (i in 0 until size) {
        var addValue = size / 2 - i

        while (addValue <= size && sequence.size < size) {
            sequence.add(addValue)
            addValue += size / 2
        }
    }

    println(sequence.joinToString(" "))
}