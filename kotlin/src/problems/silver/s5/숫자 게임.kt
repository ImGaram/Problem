package problems.silver.s5

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val people = readLine().toInt()
    val maxList = mutableListOf<Int>()

    for (i in 0 until people) {
        val cards = readLine().split(" ").map { it.toInt() }
        var max = 0

        for (i0 in cards.indices) {
            for (i1 in i0 + 1 until cards.size) {
                for (i2 in i1 + 1 until cards.size) {
                    val cardSum = cards[i0] + cards[i1] + cards[i2]
                    val lastNum = cardSum.toString().last().digitToInt()
                    if (max < lastNum) max = lastNum
                }
            }
        }

        maxList.add(max)
    }

    println(maxList.indexOfLast { it == maxList.max() }+1)
}