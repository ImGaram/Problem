package src.problems.silver

import java.util.Scanner

// 백준 16953번 A -> B
fun main() = with(Scanner(System.`in`)) {
    val start = nextInt()
    var complete = nextInt()

    // 홀수일 때,
    // 1003
    var calculation = 1     // 연산 횟수(1을 더한 값을 출력해야 하기 때문에 초기값을 1로).
    while (complete != start) {
        // 값이 0으로 딱 나누어 떨어진 경우.
        if (complete == 0) {
            calculation = -1
            break
        }

        if (complete.toString().toInt() % 2 == 0) {
            complete /= 2
        } else if (complete.toString().last() == '1') {
            complete = (complete - 1) / 10
        } else {
            calculation = -1
            break
        }

        calculation++
    }

    println(calculation)
}