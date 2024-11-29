package problems.silver.s5

import java.io.BufferedReader
import java.io.InputStreamReader

private val color = arrayOf(0, 1, 2, 3)

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val n = bf.readLine().toInt()
    val cards = bf.readLine().split(" ").map { it.toInt() }.toIntArray()

    for (i in 0 until n) {
        var choose = 0
        // 현재 색, 다음 색 보기.

        if (cards[i] == 0) {
            // 현재 식이 없을 떄,
            // 다음 색을 보고 그 색과 다른 색 고르기.
            if (i != n - 1) {
                // 마지막 값을 보는 경우 다음 index의 값을 볼 수 없음.
                // 그래서 이전의 값으로만 확인.
                color[cards[i + 1]] = 0
            }

            // 색 고릐기
            for (c in color) {
                if (c != 0) {
                    choose = c
                    break
                }
            }

        } else {
            // 현재 색이 있을 떄,
            // 현재 색 그대로 고르기.
            choose = cards[i]
            if (i >= 1) {
                // 만약 이전의 색과 통일한 값이 오고 있으면 -1 출력 후 종료.
                if (choose == cards[i - 1]) {
                    println(-1)
                    return
                }
            }
        }

        // 고른 색 적용.
        cards[i] = choose
        // i가 1 이상일 때 => 현재 코른 색을 제외한 다른 색을 모두 살리기.
        rollback()
        color[choose] = 0
    }

    println(cards.joinToString(" "))
}

private fun rollback() {
    for (i in 0 .. 3) {
        color[i] = i
    }
}