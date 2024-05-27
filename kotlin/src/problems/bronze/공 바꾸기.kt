package src.problems.bronze

import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    // 공의 개수와 바꿀 횟수
    val ballChange = nextLine()
    val ball = ballChange.split(" ")[0].toInt()
    val changeCnt = ballChange.split(" ")[1].toInt()

    // 최종 결과
    val resultChange = (1..ball).toMutableList()

    // 변결 횟수만큼 change 입력하기.
    repeat(changeCnt) {
        val change = nextLine()
        val changing1 = change.split(" ")[0].toInt()
        val changing2 = change.split(" ")[1].toInt()

        val swapTemp = resultChange[changing1 - 1]
        resultChange[changing1 - 1] = resultChange[changing2 - 1]
        resultChange[changing2 - 1] = swapTemp
    }

    resultChange.forEach {
        print("$it ")
    }
}