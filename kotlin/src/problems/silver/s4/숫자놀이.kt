package problems.silver.s4

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val numberEng = listOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")
    val (start, end) = readLine().split(" ").map { it.toInt() }

    val resultMap = mutableMapOf<Int, String>()
    for (i in start .. end) {
        if (i / 10 != 0) {
            resultMap[i] = "${numberEng[i / 10]} ${numberEng[i % 10]}"
        } else {
            resultMap[i] = numberEng[i]
        }
    }

    val mapEntries = LinkedList(resultMap.entries)
    mapEntries.sortBy { it.value }

    for (i in 0 until mapEntries.size) {
        if (i % 10 == 9) println(mapEntries[i].key)
        else print("${mapEntries[i].key} ")
    }
}