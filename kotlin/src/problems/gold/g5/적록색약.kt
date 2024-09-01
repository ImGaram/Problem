package problems.gold.g5

import java.io.BufferedReader
import java.io.InputStreamReader

private val dx = listOf(-1, 1, 0, 0)
private val dy = listOf(0, 0, -1, 1)

private var graph = arrayOf<MutableList<Int>>()
private var colorBlindGraph = arrayOf<MutableList<Int>>()
private var visited = arrayOf<Array<Boolean>>()

private var searchNum = 1

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val size = readLine().toInt()

    graph = Array(size) { mutableListOf() }
    colorBlindGraph = Array(size) { mutableListOf() }
    visited = Array(size) { Array(size) { false } }

    for (i in 0 until size) {
        val input = readLine()
        val list = input.map { when (it) { 'R' -> 1 'G' -> 2 'B' -> 3 else -> 0 } }
        val colorBlindList = input.map { when (it) { 'R' -> 2 'G' -> 2 'B' -> 3 else -> 0 } }

        graph[i].addAll(list)
        colorBlindGraph[i].addAll(colorBlindList)
    }

    var graphZoneCnt = 0
    var colorBlindZoneCnt = 0

    for (c in 1 .. 3) {
        searchNum = c

        for (i in graph.indices) {
            for (j in graph[i].indices) {
                if (graph[i][j] == searchNum && !visited[i][j]) {
                    visited[i][j] = true
                    graphZoneCnt++
                    search(i, j, graph)
                }
            }
        }
    }

    // visited 초기화
    visited = Array(size) { Array(size) { false } }
    for (c in 2 .. 3) {
        searchNum = c

        for (i in colorBlindGraph.indices) {
            for (j in colorBlindGraph[i].indices) {
                if (colorBlindGraph[i][j] == searchNum && !visited[i][j]) {
                    visited[i][j] = true
                    colorBlindZoneCnt++
                    search(i, j, colorBlindGraph)
                }
            }
        }
    }

    println("$graphZoneCnt $colorBlindZoneCnt")
}

private fun search(x: Int, y: Int, graph: Array<MutableList<Int>>) {
    for (i in dx.indices) {
        val nx = x + dx[i]
        val ny = y + dy[i]

        if (nx in graph.indices && ny in graph[0].indices) {
            if (graph[nx][ny] == searchNum && !visited[nx][ny]) {
                visited[nx][ny] = true
                search(nx, ny, graph)
            }
        }
    }
}