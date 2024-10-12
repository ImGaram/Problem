package problems.silver.s2

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (s, e, q) = readLine().split(" ")
    val attendance = mutableMapOf<String, MutableList<String>>()
    val (startH, startM) = s.split(":").map { it.toInt() }
    val (endH, endM) = e.split(":").map { it.toInt() }
    val (endStreamH, endStreamM) = q.split(":").map { it.toInt() }
    var answer = 0

    while (true) {
        val input = readLine() ?: break
        val chatting = input.split(" ")

        if (!attendance.containsKey(chatting[1])) attendance[chatting[1]] = mutableListOf(chatting[0])
        else attendance[chatting[1]]?.add(chatting[0])
    }

    for (student in attendance) {
        val time = student.value
        var isEnter = false
        var isExit = false

        for (i in 0 until time.size) {
            val (hour, min) = time[i].split(":").map { it.toInt() }
            // 입장 시간 포함 이전 시간에 채팅을 했는가?
            if (compareTime(hour, min, startH, startM)) isEnter = true

            // 채팅 시간이 종료 시간보다 이후 시간대이면서 채팅 시간이 스트림 종료 시간 이전이어야 함.
            if (compareTime(endH, endM, hour, min) && compareTime(hour, min, endStreamH, endStreamM)) isExit = true
        }

        if (isEnter && isExit) answer++
    }

    println(answer)
}

/**
 * time1 과 time2를 비교
 *
 * time1이 time2와 같거나, time2보다 이전 시간대이면 true
 */
private fun compareTime(hour1: Int, min1: Int, hour2: Int, min2: Int): Boolean {
    return if (hour1 < hour2) true
    else if (hour1 == hour2 && min1 <= min2) true
    else false
}