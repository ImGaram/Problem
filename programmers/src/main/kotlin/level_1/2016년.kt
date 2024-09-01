package main.kotlin.level_1

import java.time.LocalDate

class `2016년` {
    fun solution(a: Int, b: Int): String {
        val datetime = LocalDate.of(2016, a, b)
        return datetime.dayOfWeek.name.substring(0, 3)
    }
}

fun main() {
    println(`2016년`().solution(5, 24))
}