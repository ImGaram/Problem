package problems.silver.s1

import java.io.BufferedReader
import java.io.InputStreamReader

private var graph = arrayOf<Array<Int>>()
private var visited = arrayOf<Array<Boolean>>()

private val dx = listOf(-1,1,0,0)
private val dy = listOf(0,0,-1,1)

var zoneCnt = 0

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (width, height, case) = readLine().split(" ").map { it.toInt() }

    graph = Array(width) { Array(height) { 1 } }
    visited = Array(width) { Array(height) { false } }

    val zones = mutableListOf<Int>()
    for (c in 0 until case) {
        val (startP1, startP2, endP1, endP2) = readLine().split(" ").map { it.toInt() }

        for (w in startP2 ..< endP2) {
            for (h in startP1 ..< endP1) {
                graph[w][h] = 0
            }
        }
    }

    for (i in 0 until width) {
        for (j in 0 until height) {
            if (graph[i][j] == 1 && !visited[i][j]) {
                zoneCnt = 1
                visited[i][j] = true
                find(i, j)
                zones.add(zoneCnt)
            }
        }
    }

    println(zones.size)
    zones.sort()
    println(zones.joinToString(" "))
}

private fun find(x: Int, y: Int) {
    for (i in dx.indices) {
        val nx = x + dx[i]
        val ny = y + dy[i]

        if (nx in graph.indices && ny in graph[x].indices) {
            if (graph[nx][ny] == 1 && !visited[nx][ny]) {
                visited[nx][ny] = true
                zoneCnt++
                find(nx, ny)
            }
        }
    }
}