package problems.gold.g5

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

private val ladderSnake = mutableMapOf<Int, Int>()
private val visited = BooleanArray(101)
private var result = 0

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (ladder, snake) = readLine().split(" ").map { it.toInt() }

    for (i in 1 .. ladder) {
        val (ladderStart, ladderEnd) = readLine().split(" ").map { it.toInt() }
        ladderSnake[ladderStart] = ladderEnd
    }

    for (i in 1 .. snake) {
        val (snakeStart, snakeEnd) = readLine().split(" ").map { it.toInt() }
        ladderSnake[snakeStart] = snakeEnd
    }

    bfs()

    println(result)
}

private fun bfs() {
    val queue = ArrayDeque<List<Int>>()
    queue.addFirst(listOf(1, 0))     // 현재 위치, 움직인 횟수
    visited[1] = true

    while (queue.isNotEmpty()) {
        val data = queue.removeLast()
        val locate = data.first()
        val move = data.last()

        if (locate >= 100) {
            result = move
            return
        }

        for (m in 1 .. 6) {
            val location = locate + m

            if (location > 100) continue
            if (visited[location]) continue

            if (ladderSnake.containsKey(location)) {
                queue.addFirst(listOf(ladderSnake[location]!!, move + 1))
                visited[ladderSnake[location]!!] = true
            } else {
                queue.addFirst(listOf(location, move + 1))
                visited[location] = true
            }
        }
    }
}