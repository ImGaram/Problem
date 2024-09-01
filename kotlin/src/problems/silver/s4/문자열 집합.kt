package problems.silver.s4

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (setCnt, strCnt) = readLine().split(" ").map { it.toInt() }
    val set = mutableSetOf<String>()

    for (i in 0 until setCnt) {
        set.add(readLine())
    }

    var cnt = 0
    for (i in 0 until strCnt) {
        val searchValue = readLine()

        if (set.contains(searchValue)) cnt++
    }

    println(cnt)
}