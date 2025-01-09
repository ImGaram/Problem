package problems.bronze.b2

import java.io.BufferedReader
import java.io.InputStreamReader
import java.time.LocalDate

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val n = bf.readLine().toLong()
    val sd = LocalDate.of(2014, 4, 2)

    println(sd.plusDays(n - 1))
}