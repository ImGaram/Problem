package problems.silver.s2

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val case = readLine().toInt()
    val list = readLine().split(" ").map { it.toInt() }
    val sorted = list.distinct().sorted()

    for (i in list.indices) {
        bw.write("${sorted.binarySearch(list[i])} ")
    }

    bw.flush()
    bw.close()
}