package problems.silver

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val meetingArray = Array<List<Int>>(readLine().toInt()) { emptyList() }

    for (i in meetingArray.indices) {
        meetingArray[i] = readLine().split(" ").map { it.toInt() }
    }

    meetingArray.sortBy { it[0] }
    meetingArray.sortBy { it[1] }

    var meetingStartTime = 0
    var meetingCnt = 0
    for (i in meetingArray.indices) {
        if (meetingStartTime <= meetingArray[i][0]) {
            meetingStartTime = meetingArray[i][1]
            meetingCnt++
        }
    }

    println(meetingCnt)
}