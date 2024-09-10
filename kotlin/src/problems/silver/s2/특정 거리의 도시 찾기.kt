package problems.silver.s2

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.Queue

private var cities = arrayOf(mutableListOf<Int>())
private var visited = booleanArrayOf()
private val answer = mutableListOf<Int>()

private var city = 0
private var road = 0
private var minDistance = 0

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val input = readLine().split(" ").map { it.toInt() }
    val start = input[3]

    city = input[0]
    road = input[1]
    minDistance = input[2]
    cities = Array(city + 1) { mutableListOf() }
    visited = BooleanArray(city + 1)

    for (i in 0 until road) {
        val roadInfo = readLine().split(" ").map { it.toInt() }
        val roadStart = roadInfo[0]
        val roadEnd = roadInfo[1]
        cities[roadStart].add(roadEnd)
    }

    dfs(start)

    answer.sort()
    if (answer.isEmpty()) println(-1)
    else println(answer.joinToString("\n"))
}

private fun dfs(start: Int) {
    val queue: Queue<List<Int>> = LinkedList()
    queue.add(listOf(start, 0))
    visited[start] = true

    while (queue.isNotEmpty()) {
        val data = queue.poll()
        val beforeCity = data[0]
        val currentDistance = data[1]

        if (currentDistance == minDistance) answer.add(beforeCity)

        for (i in cities[beforeCity]) {
            if (!visited[i]) {
                visited[i] = true
                queue.add(listOf(i, currentDistance + 1))
            }
        }
    }
}