package problems.silver

import java.io.BufferedReader
import java.io.InputStreamReader
import java.time.LocalDateTime

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val monthParser = mapOf(
        "January" to 1, "February" to 2, "March" to 3, "April" to 4,
        "May" to 5, "June" to 6, "July" to 7, "August" to 8,
        "September" to 9, "October" to 10, "November" to 11, "December" to 12,
    )
    val dateString = readLine().split(" ")

    val month = monthParser[dateString.first()]!!
    val dayOfMonth = dateString[1].replace(",", "").toInt()
    val year = dateString[2].toInt()

    val time = dateString[3].split(":")
    val hour = time.first().toInt()
    val minute = time.last().toInt()

    val localDateTime = LocalDateTime.of(year, month, dayOfMonth, hour, minute, 0)
    val dayProgressNum = (localDateTime.dayOfYear - 1) * 1440.0 + hour * 60 + minute

    // 윤년이면 366일
    val yearToMinute = if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) 1440 * 366
    else 1440 * 365
    println(dayProgressNum / yearToMinute * 100)

}