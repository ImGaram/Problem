package problems.bronze

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val case = readLine().toInt()

    for (i in 0 until case) {
        val demeritString = readLine()
        var leaveWeeks = 0          // 총 퇴사 주
        var prev = 0
        var demeritPoints = 0       // 변환한 벌점의 합
        var isBreak = false

        for (j in demeritString.indices) {
            val charToCode = demeritString[j].code
            demeritPoints += if (charToCode in 48 .. 57) {
                // 벌점 문자가 숫자로 들어옴.
                charToCode - 48
            } else {
                // 벌점 문자가 영어로 들어옴.
                charToCode - 55
            }

            val q = demeritPoints / 10
            if (q > prev) {
                if (q <= 3) leaveWeeks += q
                else if (q == 4) {
                    println("${leaveWeeks}(weapon)")
                    isBreak = true
                    break
                } else {
                    println("${leaveWeeks}(09)")
                    isBreak = true
                    break
                }
            }
            prev = q
        }

        if (!isBreak) println("$leaveWeeks")
    }
}