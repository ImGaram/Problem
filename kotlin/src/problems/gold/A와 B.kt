package src.problems.gold

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.system.exitProcess

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val string = readLine()
    val complete = StringBuilder(readLine())

    // string, complete가 A와 B가 아닌 경우
    if (string.any { it != 'A' && it != 'B' }) {
        println(0)
        exitProcess(0)
    }
    if (complete.any { it != 'A' && it != 'B' }) {
        println(0)
        exitProcess(0)
    }

    // 초기 string의 맨 뒤 문자가 A냐 B냐에 따라서 동작이 달라야 함.
    // A면 뒤집고 B 추가
    // B면 A 추가
    // 2개의 로직을 상항에 따라 사용할 수 있어야 함.
    // 로직을 역순으로 돌면서 처음의 input과 같아지는지 체크하기
    while (string != complete.toString()) {
        // 문자열이 비어 있으면 반복 종료.
        if (complete.isEmpty()) break

        if (complete.last() == 'A') {
            // 맨 뒤의 문자가 a인 경우
            complete.deleteCharAt(complete.lastIndex)
        } else {
            // 맨 뒤의 문자가 b인 경우
            complete.reverse()
            complete.deleteCharAt(0)
        }
    }

    if (string == complete.toString()) println(1)
    else println(0)
}