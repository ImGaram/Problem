package array

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val num = readLine().toInt()

    repeat(num) {
        val quest = readLine()  // OX 입력
        var score = 0   // 더해질 점수
        var total = 0   // 총점

        for (i in 0 until quest.length) {   // quest 길이만큼 반복
            if (quest[i] == 'O') {
                score++ // quest 가 'O' 일때 증가
                total+=score    // 종첨 합
            }
            else score = 0  // 'X' 면 score 0 으로 초기화
        }
        println(total)
    }
}