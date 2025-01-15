package problems.bronze.b1

import java.io.BufferedReader
import java.io.InputStreamReader
import java.time.LocalDate

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val (x, y) = bf.readLine().split(" ").map { it.toInt() }
    val localDate = LocalDate.of(2007, x, y)

    println(localDate.dayOfWeek.name.substring(0, 3))
}