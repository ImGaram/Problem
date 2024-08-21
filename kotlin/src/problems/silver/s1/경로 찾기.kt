package problems.silver.s1

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.Queue

private var graph = arrayOf<List<Int>>()
private var result = arrayOf<Int>()
private var visited = booleanArrayOf()

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val point = readLine().toInt()

    graph = Array(point) { listOf() }
    result = Array(point) { 0 }
    visited = BooleanArray(point)

    for (i in 0 until point) {
        val path = readLine().split(" ").map { it.toInt() }
        graph[i] = path
    }

    for (i in graph.indices) {
        for (j in graph[i].indices) {
            if (!visited[i] && graph[i][j] == 1) {
                bfs(j)
            }
        }
        println(result.joinToString(" "))

        visited.fill(false)
        result.fill(0)
    }
}

private fun bfs(x: Int) {
    val queue: Queue<Int> = LinkedList()
    queue.add(x)
    result[x] = 1
    visited[x] = true

    while (queue.isNotEmpty()) {
        val dataX = queue.poll()

        for (i in 0 until graph[dataX].size) {
            if (!visited[i] && graph[dataX][i] == 1) {
                visited[i] = true
                queue.add(i)
                result[i] = 1
            }
        }
    }
}