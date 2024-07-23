package problems.silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

private var visited = arrayOf<BooleanArray>()
private var map = arrayOf<Array<Int>>()

private val dx = listOf(-1, 1, 0, 0)
private val dy = listOf(0, 0, -1, 1)

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (sizeY, sizeX) = readLine().split(" ").map { it.toInt() }
    visited = Array(sizeY) { BooleanArray(sizeX) { false } }
    map = Array(sizeY) { Array(sizeX) { 0 } }

    var startPoint = emptyList<Int>()
    for (i in 0 until sizeY) {
        val mapData = readLine().split(" ").map { it.toInt() }
        map[i] = mapData.map { if (it != 0) -1 else 0 }.toTypedArray()

        if (startPoint.isEmpty()) {
            for (j in mapData.indices) if (mapData[j] == 2) startPoint = listOf(i, j)
        }
    }

    bfs(startPoint)

    for (i in map.indices) {
        bw.write("${map[i].joinToString(" ")}\n")
    }

    bw.flush()
    bw.close()
}

private fun bfs(startPoint: List<Int>) {
    val queue = ArrayDeque<List<Int>>()
    queue.addFirst(startPoint)
    visited[startPoint[0]][startPoint[1]] = true
    map[startPoint[0]][startPoint[1]] = 0

    while (queue.isNotEmpty()) {
        val data = queue.removeLast()

        for (i in dx.indices) {
            val mx = data[1] + dx[i]
            val my = data[0] + dy[i]

            if (mx in 0..< map[0].size && my in map.indices) {
                if (!visited[my][mx] && map[my][mx] != 0) {
                    visited[my][mx] = true
                    map[my][mx] = map[data[0]][data[1]] + 1
                    queue.addFirst(listOf(my, mx))
                }
            }
        }
    }
}