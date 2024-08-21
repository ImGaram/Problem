package problems.silver.s2

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.Queue

private var graph = arrayOf<MutableList<Int>>()
private var visited = booleanArrayOf()
private var parentNode = arrayOf<Int>()

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val nodeCnt = readLine().toInt()

    graph = Array(nodeCnt +1) { mutableListOf() }
    visited = BooleanArray(nodeCnt +1)
    parentNode = Array(nodeCnt +1) { 0 }

    for (i in 1 until nodeCnt) {
        val relationship = readLine().split(" ").map { it.toInt() }
        graph[relationship[0]].add(relationship[1])
        graph[relationship[1]].add(relationship[0])
    }

    search()

    val result = StringBuilder()
    for (i in 2 until parentNode.size) {
        result.append(parentNode[i]).append("\n")
    }
    println(result)
}

private fun search(start: Int = 1) {
    val queue: Queue<Int> = LinkedList()
    queue.add(start)
    visited[start] = true

    while (queue.isNotEmpty()) {
        val data = queue.poll()

        for (node in graph[data]) {
            if (!visited[node]) {
                queue.add(node)
                visited[node] = true

                parentNode[node] = data
            }
        }
    }
}