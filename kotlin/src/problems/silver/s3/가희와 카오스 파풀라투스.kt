package problems.silver.s3

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    var (hour, minute) = bf.readLine().split(":").map { it.toInt() }
    val clockArea = bf.readLine().split(" ").map { it.toInt() }.toTypedArray()
    val l = bf.readLine().toInt()

    var currentArea = getArea(hour)
    var healHp = 0
    for (e in 0 until l) {
        val input = bf.readLine().split(" ")
        val action = input[1]

        if (action == "^") {
            clockArea[currentArea] = 0

            if (clockArea.count { it == 0 } == 6) break
        } else {
            val resTime = if (action.last() == 'N') {
                plusTime(hour, minute, action.substring(0, action.length - 3).toInt())
            } else {
                val subTime = action.substring(0, action.length - 4).toInt()
                plusTime(hour, minute, subTime * 60)
            }

            hour = resTime[0]
            minute = resTime[1]

            currentArea = getArea(hour)
        }
    }

    healHp +=  if (clockArea.sum() > 100) 100 else clockArea.sum()

    println(healHp)
}

private fun getArea(hour: Int): Int {
    return hour / 2
}

private fun plusTime(hour: Int, minute: Int, addMin: Int): List<Int> {
    if (minute + addMin >= 60) {
        val addHour = (minute + addMin) / 60

        return listOf((hour + addHour) % 12, (minute + addMin) % 60)
    } else {
        return listOf(hour, minute + addMin)
    }
}