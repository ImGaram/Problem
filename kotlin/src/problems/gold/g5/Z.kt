package problems.gold.g5

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.pow

private var visitNumber = 0

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (size, x, y) = readLine().split(" ").map { it.toInt() }
    val mapSize = 2.0.pow(size).toInt()

    comparison(x, y, mapSize / 2)
    println(visitNumber)
}

private fun comparison(x: Int, y: Int, mapSize: Int) {
    if (mapSize == 1) {
        // 남은 x, y만큼 더하기
        // 사분면 순서는 z임.
        // 0, 0 => 1사분면
        // 0, 1 => 2사분면
        // 1, 0 => 3사분면
        // 1, 1 => 4사분면
        visitNumber += if (x == 0) {
            if (y == 0) 0 else 1
        } else {
            if (y == 0) 2 else 3
        }

        return
    }

    if (x < mapSize && y < mapSize) {
        comparison(x, y, mapSize / 2)
    } else if (x < mapSize && y >= mapSize) {
        visitNumber += (mapSize * 2).toDouble().pow(2).toInt() / 4
        comparison(x, y - mapSize, mapSize / 2)
    } else if (x >= mapSize && y < mapSize) {
        visitNumber += (mapSize * 2).toDouble().pow(2).toInt() / 4 * 2
        comparison(x - mapSize, y, mapSize / 2)
    } else {
        visitNumber += (mapSize * 2).toDouble().pow(2).toInt() / 4 * 3
        comparison(x - mapSize, y - mapSize, mapSize / 2)
    }
}