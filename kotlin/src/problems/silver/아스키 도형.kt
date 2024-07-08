package problems.silver

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (mapX, mapY) = readLine().split(" ").map { it.toInt() }
    var slashCnt = 0
    var commaCnt = 0

    for (i in 0 until mapX) {
        val input = readLine()
        var slashStart = -1
        var slashEnd = -1
        var commaAdd = 0

        // 입력값에 콤마가 존재하는 경우.
        if (input.contains(".")) {
            for (j in input.indices) {
                if (input[j] == '\\' || input[j] == '/') {
                    // slash의 시작점이 -1이면 시작점을 설정
                    if (slashStart == -1) slashStart = j
                    else {
                        if (slashEnd == -1) {
                            // 종료점이 -1이면 종료점 적용 및 안에 들어 있던 comma의 개수를 더함.
                            slashEnd = j
                            commaCnt += commaAdd
                            commaAdd = 0
                        } else {
                            // 종료점이 -1이 아니면 새롭게 시작점을 설정해야 한다.
                            // 시작점을 변경 해주고 종료점을 -1로 변경.
                            slashStart = j
                            slashEnd = -1
                            commaAdd = 0
                        }
                    }
                    slashCnt++
                } else {
                    // input[j]가 slash가 아니면 comma라는 뜻.
                    // 시작점이 -1이 아니면 commaAdd를 증가시키기.
                    if (slashStart != -1) commaAdd++
                }
            }
        }
        // 입력값에 콤마가 존재하지 않으면 slash만 존재한다는 뜻.
        else slashCnt += input.length
    }

    println(slashCnt / 2 + commaCnt)
}