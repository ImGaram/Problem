package problems.silver.s1

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

private var map = arrayOf(arrayOf<Int>())
private val move = listOf(
    listOf(1, 2),
    listOf(-1, 2),
    listOf(1, -2),
    listOf(-1, -2),
    listOf(2, 1),
    listOf(2, -1),
    listOf(-2, 1),
    listOf(-2, -1),
)
private var answer = 0
private var size = 0

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val case = readLine().toInt()

    for (i in 0 until case) {
        size = readLine().toInt()
        answer = 0
        map = Array(size) { Array(size) { 0 } }

        val (startX, startY) = readLine().split(" ").map { it.toInt() }
        val (endX, endY) = readLine().split(" ").map { it.toInt() }

        bfs(startX, startY, endX, endY)

        println(answer)
    }
}

private fun bfs(x: Int, y: Int, endX: Int, endY: Int) {
    val queue: Queue<List<Int>> = LinkedList()
    map[x][y] = 1
    queue.add(listOf(x, y, 0))

    while (queue.isNotEmpty()) {
        val data = queue.poll()
        val currentX = data[0]
        val currentY = data[1]
        val currentMove = data[2]

        if (currentX == endX && currentY == endY) {
            answer = currentMove
            return
        }

        for (i in move.indices) {
            val mx = currentX + move[i][0]
            val my = currentY + move[i][1]

            if (mx in 0 until size && my in 0 until size) {
                if (map[mx][my] == 0) {
                    map[mx][my] = 1
                    queue.add(listOf(mx, my, currentMove + 1))
                }
            }
        }
    }
}