package problems.silver.s1

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.Queue

private var map = arrayOf<List<Int>>()
private var moveMap = arrayOf<MutableList<Int>>()
private var visited = arrayOf<BooleanArray>()

private val dx = listOf(-1, 1, 0, 0)
private val dy = listOf(0, 0, -1, 1)

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (h, w) = readLine().split(" ").map { it.toInt() }

    map = Array(h) { listOf() }
    moveMap = Array(h) { MutableList(w) { 0 } }
    visited = Array(h) { BooleanArray(w) }

    for (i in 0 until h) {
        val input = readLine().map { it.digitToInt() }
        map[i] = input
    }

    bfs()
}

private fun bfs() {
    val queue: Queue<List<Int>> = LinkedList()
    queue.add(listOf(0, 0))
    visited[0][0] = true
    moveMap[0][0] = 1

    while (queue.isNotEmpty()) {
        val data = queue.poll()
        val y = data.first()
        val x = data.last()
        val move = moveMap[y][x]

        for (i in dx.indices) {
            val mx = x + dx[i]
            val my = y + dy[i]

            if (mx in map[0].indices && my in map.indices) {
                if (!visited[my][mx] && map[my][mx] == 1) {
                    visited[my][mx] = true
                    moveMap[my][mx] = move + 1
                    queue.add(listOf(my, mx))

                    if (my == map.size - 1 && mx == map[0].size - 1) {
                        println(move + 1)
                        return
                    }
                }
            }
        }
    }
}