package src.problems.silver

import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val num = nextInt()
    var sequence = 0
    var line = 1

    // num이 몇 줄에 해당하는지 확인
    // a/b 일때, 홀수줄인 경우 a는 줄어들고, b는 커짐. 짝수는 반대.
    // 공차가 1인 등차수열의 합 공식
    // n(n-1) / 2
    while (true) {
        sequence = line * (line+1) / 2
        if (sequence >= num) break
        line++
    }

    // n번째 줄에서 몇 번째의 숫자인지 체크.
    val th = num - (line-1) * line / 2

    // 짝수인 경우 a/b가 있을 때,
    // a가 1부터 시작해 하나씩 늘어나고, b가 line으로 시작해 줄어든다.
    // 홀수인 경우
    // a가 line으로 시작해 하나씩 줄어들고, b가 1부터 시작해 늘어난다.
    if (line % 2 == 0) {
        println("${th}/${line-th+1}")
    } else {
        println("${line-th+1}/${th}")
    }
}