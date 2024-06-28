package problems.silver

import java.io.BufferedReader
import java.io.InputStreamReader

private var graph = arrayOf<MutableList<Int>>()
private var visited = arrayOf<Array<Boolean>>()

private val dx = listOf(-1, 1, 0, 0, -1, 1, -1, 1)
private val dy = listOf(0, 0, -1, 1, -1, 1, 1, -1)

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    while (true) {
        var isLandCnt = 0
        val (y, x) = readLine().split(" ").map { it.toInt() }
        if (x == 0 && y == 0) break

        graph = Array(x) { mutableListOf() }
        visited = Array(x) { Array(y) { false } }
        for (i in 0 until x) {
            graph[i].addAll(readLine().split(" ").map { it.toInt() })
        }

        for (i in 0 until x) {
            for (j in 0 until y) {
                if (graph[i][j] == 1 && !visited[i][j]) {
                    visited[i][j] = true
                    isLandCnt++

                    island(i, j, x, y)
                }
            }
        }

        println(isLandCnt)
    }
}

private fun island(x: Int, y: Int, xSize: Int, ySize: Int) {
    for (i in dx.indices) {
        val mx = x + dx[i]
        val my = y + dy[i]

        if (mx in 0 ..< xSize && my in 0 ..< ySize) {
            if (graph[mx][my] == 1 && !visited[mx][my]) {
                visited[mx][my] = true

                island(mx, my, xSize, ySize)
            }
        }
    }
}