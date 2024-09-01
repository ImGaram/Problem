package src.problems.silver

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    // 기준이 될 숫자 리스트.
    readLine().toInt()
    val standardList = mutableSetOf<String>()
    standardList.addAll(readLine().split(" "))

    // 존재하는지 확인할 숫자 리스트
    val existCnt = readLine().toInt()
    val existInput = StringTokenizer(readLine())
    val resultStr = StringBuilder()
    for (i in 0 until existCnt) {
        if (existInput.hasMoreTokens()) {
            if (standardList.contains(existInput.nextToken())) resultStr.append(1).append("\n")
            else resultStr.append(0).append("\n")
        }
    }

    print(resultStr)
}