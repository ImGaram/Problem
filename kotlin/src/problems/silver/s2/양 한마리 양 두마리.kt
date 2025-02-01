package problems.silver.s2

import java.io.BufferedReader
import java.io.InputStreamReader

private val dx = listOf(0, 0, -1, 1)
private val dy = listOf(-1, 1, 0, 0)

private var map = arrayOf(listOf<String>())
private var visited = arrayOf(booleanArrayOf())

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val t = bf.readLine().toInt()
    val sb = StringBuilder()

    for (ti in 0 until t) {
        val (h, w) = bf.readLine().split(" ").map { it.toInt() }
        map = Array(h) { listOf() }
        visited = Array(h) { BooleanArray(w) }

        for (i in 0 until h) {
            map[i] = bf.readLine().map { it.toString() }
        }

        var flock = 0
        for (i in map.indices) {
            for (j in map[i].indices) {
                if (!visited[i][j] && map[i][j] == "#") {
                    visited[i][j] = true

                    flock++
                    bfs(i, j)
                }
            }
        }

        sb.append("$flock\n")
    }

    print(sb)
}

private fun bfs(y: Int, x: Int) {
    for (i in dx.indices) {
        val mx = x + dx[i]
        val my = y + dy[i]

        if (my in map.indices && mx in map[my].indices) {
            if (!visited[my][mx] && map[my][mx] == "#") {
                visited[my][mx] = true

                bfs(my, mx)
            }
        }
    }
}