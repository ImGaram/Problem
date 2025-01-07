package problems.silver.s1

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    var n = bf.readLine().toInt()
    val weight = Array(n + 1) { 0 }

    while (n > 0) {
        // 납의 개수를 이용해 만들 수 있는 저울추의 무게 구하기
        var cw = 1
        while (cw <= n) {
            // 현재 납의 개수보다 그 다음으로 큰 2의 제곱수를 구하기
            cw *= 2
        }

        // 나열 시작
        val start = cw - n  // 나열을 시작할 index
        for (i in start .. n) {
            // i번째 납에 해당하는 주석의 무게를 구하기 -> 중복되지 않게 주석의 무게를 정할 수 있음
            weight[i] = cw - i
        }

        // 남은 납의 개수를 정의
        n = start - 1
    }

    val answer = StringBuilder()
    for (i in 1 until weight.size) {
        answer.append("${weight[i]}\n")
    }

    println(answer)
}