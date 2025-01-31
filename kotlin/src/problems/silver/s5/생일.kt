package problems.silver.s5

import java.io.BufferedReader
import java.io.InputStreamReader
import java.time.LocalDate

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val n = bf.readLine().toInt()
    val dateList = mutableListOf<Pair<String, LocalDate>>()

    for (i in 0 until n) {
        val (name, d, m, y) = bf.readLine().split(" ")
        dateList.add(Pair(name, LocalDate.of(y.toInt(), m.toInt(), d.toInt())))
    }

    dateList.sortBy { it.second }

    println(dateList.last().first)
    println(dateList.first().first)
}