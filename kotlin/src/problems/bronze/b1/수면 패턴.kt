package problems.bronze.b1

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (sleepHour, case) = readLine().split(" ").map { it.toInt() }

    var sleep = 0
    for (i in 0 until case) {
        val input = readLine().split(" ")
        val sleepStart = input[1].toInt()
        val sleepEnd = input[3].toInt()

        val sleepStartDayCode = parseDayCode(input[0])
        val sleepEndDayCode = parseDayCode(input[2])

        // 2일 이상 자는 경우를 대비해 수면 종료일과 수면 시작일의 차이에 24를 곱해 추가적인 수면 시간을 체크한다.
        sleep += sleepEnd - sleepStart + (sleepEndDayCode-sleepStartDayCode) * 24
    }

    // 잠을 충분히 잔 경우 음수가 나옴.
    if (sleepHour - sleep < 0) println(0)
    // 주말에 충분히 잘 수 있으면 출력
    else if (sleepHour - sleep <= 48) println(sleepHour - sleep)
    // 주말에 풀로 자도 부족한 경우.
    else println(-1)
}

// 날짜를 숫자 코드로 변환함.
private fun parseDayCode(day: String): Int {
    return when (day) {
        "Mon" -> 1
        "Tue" -> 2
        "Wed" -> 3
        "Thu" -> 4
        "Fri" -> 5
        else -> 0
    }
}