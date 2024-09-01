package src.problems.bronze

import java.io.BufferedReader
import java.io.InputStreamReader

// 전화를 걸려면 해당 번호까지 돌리고 처음부터 다시 돌려야 한다.
// 문자에 해당하는 다이얼을 찾아 그 숫자까지 돌린다.
fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val dial = readLine()
    var result = 0

    dial.forEach { char ->
        when (char) {
            'A', 'B', 'C' -> result += 3
            'D', 'E', 'F' -> result += 4
            'G', 'H', 'I' -> result += 5
            'J', 'K', 'L' -> result += 6
            'M', 'N', 'O' -> result += 7
            'P', 'Q', 'R', 'S' -> result += 8
            'T', 'U', 'V' -> result += 9
            'W', 'X', 'Y', 'Z' -> result += 10
        }
    }

    println(result)
}