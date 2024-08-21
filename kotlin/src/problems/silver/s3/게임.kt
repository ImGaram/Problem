package problems.silver.s3

import java.io.BufferedReader
import java.io.InputStreamReader

private var winRate = 0
private var games = 0
private var winCnt = 0

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val input = readLine().split(" ").map { it.toInt() }
    games = input[0]
    winCnt = input[1]
    winRate = getPercent(winCnt, games)

    binarySearch(1, 1e9.toInt())
}

private var result = -1
private fun binarySearch(start: Int, end: Int) {
    if (start > end) {
        println(result)
        return
    }

    // mid가 추가 판수가 된다.
    val mid = (start + end) / 2
    // 승률 구하기.
    val newWinRate = getPercent(winCnt + mid, games + mid)

    if (newWinRate > winRate) {
        // 새로운 승률이 기존 슴률보다 높다면?
        // mid 이후 값들(mid 포함)은 정답이 아님.
        result = mid
        binarySearch(start, mid - 1)
    } else {
        // 새로운 승률이 기존 승률보다 낮다면?
        // mid 포함 mid 이전의 값들은 정답이 아님.
        binarySearch(mid + 1, end)
    }
}

private fun getPercent(x: Int, y: Int): Int {
    return (x.toLong() * 100 / y).toInt()
}