package problems.silver

import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val squareCnt = nextInt()

    val coordinate = MutableList(501) { MutableList(501) { false } }
    for (i in 0 until squareCnt) {
        val squareStartX = nextInt()
        val squareStartY = nextInt()
        val squareEndX = nextInt()
        val squareEndY = nextInt()

        for (j in squareStartY+1 .. squareEndY) {
            for (k in squareStartX+1 .. squareEndX) {
                coordinate[j][k] = true
            }
        }
    }

    var cnt = 0
    for (i in 0 until coordinate.size) {
        for (j in 0 until coordinate[i].size) {
            if (coordinate[i][j]) cnt++
        }
    }
    println(cnt)
}