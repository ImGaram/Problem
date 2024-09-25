package problems.bronze.b3

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var (year, month, day) = readLine().split("-").map { it.toInt() }
    val cycle = readLine().toInt()

    day += cycle
    if (day > 30) {
        var addMonth = 0
        while (day > 30) {
            day -= 30
            addMonth++
        }
        month += addMonth

        if (month > 12) {
            var addYear = 0
            while (month > 12) {
                month -= 12
                addYear++
            }
            year += addYear
        }
    }

    println("${year}-${String.format("%02d", month)}-${String.format("%02d", day)}")
}