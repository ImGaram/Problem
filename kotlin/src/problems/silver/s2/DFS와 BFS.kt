package problems.silver.s2

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.Queue
import java.util.Stack

private var visited = booleanArrayOf()
// graph는 각 노드의 관계를 나타냄.
//[]            // 값 0의 접점은 없음
//[2, 3, 4]     // 값 1의 접점은 2, 3, 4
//[1, 4]
//[1, 4]
//[1, 2, 3]
private var graph = mutableListOf<MutableList<Int>>()
fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (n, m, start) = readLine().split(" ").map { it.toInt() }

    graph = MutableList(n+1) { mutableListOf() }
    visited = BooleanArray(n+1)
    for (i in 0 until m) {
        val (relation1, relation2) = readLine().split(" ").map { it.toInt() }

        graph[relation1].add(relation2)
        graph[relation2].add(relation1)
    }

    // 데이터를 정렬해주어야 데이터가 올바른 순서대로 출력됨
    graph.map { it.sort() }

    dfsRecursion(start)
    println()

    visited.fill(false)
    bfs(start)
}

// 재귀 함수를 통한 dfs 구현
private fun dfsRecursion(start: Int) {
    visited[start] = true
    val data = graph[start]
    print("$start ")

    for (node in data) {
        if (!visited[node]) {
            visited[node] = true
            dfsRecursion(node)
        }
    }
}

// 스택을 이용한 dfs 구현
private fun dfs(start: Int) {
    val stack: Stack<Int> = Stack()
    stack.push(start)
    visited[start] = true

    while (stack.isNotEmpty()) {
        val data = stack.pop()
        for (node in graph[data]) {
            if (!visited[node]) {
                stack.push(node)
                visited[node] = true
            }
        }

        print("$data ")
    }
}

// 큐를 이용한 bfs 구현
private fun bfs(start: Int) {
    val queue: Queue<Int> = LinkedList()
    queue.add(start)
    visited[start] = true
    print("$start ")

    while (queue.isNotEmpty()) {
        val data = queue.poll()
        for (node in graph[data]) {
            if (!visited[node]) {
                queue.add(node)
                visited[node] = true
                print("$node ")
            }
        }
    }
}