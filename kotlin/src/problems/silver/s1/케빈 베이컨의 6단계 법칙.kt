package problems.silver.s1

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.math.min

private var graph = arrayOf<MutableList<Int>>()
private var visited = booleanArrayOf()
private var result = 0

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (user, relationships) = readLine().split(" ").map { it.toInt() }
    graph = Array(user + 1) { mutableListOf() }
    visited = BooleanArray(user + 1)

    for (i in 0 until relationships) {
        val relationship = readLine().split(" ").map { it.toInt() }
        graph[relationship[0]].add(relationship[1])
        graph[relationship[1]].add(relationship[0])
    }

    var currentMin = Int.MAX_VALUE
    var answer = 0
    for (i in user downTo 1) {
        var totalRes = 0
        visited.fill(false)
        result = 0

        for (f in 1 .. user) {
            visited.fill(false)
            result = 0

            if (i == f) continue
            find(i, f)

            totalRes += result
        }

        val newMin = min(currentMin, totalRes)

        // 더 적은 케빈 베이컨 수를 구하기.
        if (newMin < currentMin) {
            currentMin = newMin
            answer = i
        }
        // 현재 i의 케빈 베이컨 수의 합과 현제 케빈 베이컨 수의 최솟갑과 같다면 i를 갱신해주기.
        else if (totalRes == currentMin) {
            answer = i
        }
    }

    println(answer)
}

private fun find(user: Int, toFind: Int) {
    val queue: Queue<List<Int>> = LinkedList()
    visited[user] = true

    for (u in graph[user]) {
        if (u == toFind) {
            result = 1
            return
        }
        queue.add(listOf(u, 1))
    }

    while (queue.isNotEmpty()) {
        val data = queue.poll()
        val checkUser = data[0]
        val level = data[1]

        for (g in graph[checkUser]) {
            if (!visited[g]) {
                if (g == toFind) {
                    result += level + 1
                    return
                }
                queue.add(listOf(g, level + 1))
                visited[g] = true
            }
        }
    }
}