package problems.silver.s2

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.Queue

private var graph = arrayOf<MutableList<Int>>()
private var visited = booleanArrayOf()

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (nodeCnt, case) = readLine().split(" ").map { it.toInt() }

    graph = Array(nodeCnt+1) { mutableListOf() }
    visited = BooleanArray(nodeCnt+1)

    // 그래프 정의
    for (i in 0 until case) {
        val (node1, node2) = readLine().split(" ").map { it.toInt() }
        graph[node1].add(node2)
        graph[node2].add(node1)
    }

    // 연결 요소의 개수
    var linkedCnt = 0
    // 연결 요소를 찾기 위한 반복문.
    for (node in 1 until graph.size) {
        // 아직 node를 방문하지 않았을 때 bfs 수행
        if (!visited[node]) {
            // 시작점을 node로 잡아야 돌고 나서 또 연결점을 찾을 때 시작점으로 이용 가능
            // bfs를 돌고도 visited에 false가 남아 있으면 node 끼리 떨어져 있는 부분이 있다는 뜻임.
            bfs(node)
            linkedCnt++
        }
    }

    println(linkedCnt)
}

private fun bfs(start: Int = 1) {
    val queue: Queue<Int> = LinkedList()
    queue.add(start)
    visited[start] = true

    while (queue.isNotEmpty()) {
        val data = queue.poll()

        for (node in graph[data]) {
            if (!visited[node]) {
                queue.add(node)
                visited[node] = true
            }
        }
    }
}