package src.problems.silver

import java.util.Scanner
import kotlin.math.min

// 체스판이 있을 때, 색상을 바꿔야 하는 개수의 최소값.
fun main() = with(Scanner(System.`in`)) {
    // 체스판의 Black 체스판의 최소 비용을 구하면 White 체스판의 최소 비용은 64 - black 최소값으로 구할 수 있다.
    val row = nextInt()
    val column = nextInt()
    val chessBoard = mutableListOf<String>()

    for (i in 0 until row) {
        chessBoard.add(next())
    }

    // 체스판 자르기
    val originBlackBoard = listOf("WBWBWBWB", "BWBWBWBW")
    var finalRes = 2500
    for (i in 0..row-8) {
        for (j in 0..column-8) {
            // 이 for문에서는 기준이 되는 왼쪽 위(0,0)가 될 부분을 구한다.

            // 현 체스판의 최소 비용 구하기.
            // Black 체스판의 최소 비용 구하기.
            var whiteres = 0
            for (r in 0 until 8) {
                val rowData = i + r
                for (c in 0 until 8) {
                    val colData = j + c
                    if (chessBoard[rowData][colData] != originBlackBoard[rowData % 2][c]) whiteres++
                }
            }

            val res = min(64 - whiteres, whiteres)
            if (finalRes > res) finalRes = res
        }
    }

    println(finalRes)
}