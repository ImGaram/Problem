package problems.silver.s2

import java.io.BufferedReader
import java.io.InputStreamReader

private var map = arrayOf<List<Int>>()
private var blueCutCnt = 0
private var whiteCutCnt = 0

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val mapSize = readLine().toInt()
    map = Array(mapSize) { List(mapSize) { -1 } }

    for (i in map.indices) {
        map[i] = readLine().split(" ").map { it.toInt() }
    }

    confetti(0, 0, mapSize)

    println(whiteCutCnt)
    println(blueCutCnt)
}

private fun confetti(startX: Int, startY: Int, size: Int) {
    var oneCnt = 0
    var zeroCnt = 0

    for (i in startX until size + startX) {
        for (j in startY until size + startY) {
            if (map[i][j] == 1) oneCnt++
            else zeroCnt++
        }
    }

    if (oneCnt == size * size) {
        blueCutCnt++
    } else if (zeroCnt == size * size) {
        whiteCutCnt++
    } else {
        for (i in startX until size + startX step size / 2) {
            for (j in startY until size + startY step size / 2) {
                confetti(i, j, size / 2)
            }
        }
    }
}