package problems.silver.s2

import java.io.BufferedReader
import java.io.InputStreamReader

private var map = arrayOf<List<Int>>()
private var visited = arrayOf<BooleanArray>()
private val dx = listOf(-1, 1, 0, 0)
private val dy = listOf(0, 0, -1, 1)

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (h, w) = readLine().split(" ").map { it.toInt() }

    map = Array(h) { emptyList() }
    visited = Array(h) { BooleanArray(w) }

    for (i in 0 until h) {
        val side = readLine().map { it.digitToInt() }
        map[i] = side
    }

    for (outerSide in 0 until map[0].size) {
        if (!visited[0][outerSide] && map[0][outerSide] == 0) {
            visited[0][outerSide] = true
            dfs(outerSide, 0)
        }
    }

    if (visited[visited.lastIndex].contains(true)) println("YES")
    else println("NO")
}

private fun dfs(x: Int, y: Int) {
    for (i in dx.indices) {
        val mx = x + dx[i]
        val my = y + dy[i]

        if (my in map.indices && mx in map[0].indices) {
            if (!visited[my][mx] && map[my][mx] == 0) {
                visited[my][mx] = true
                dfs(mx, my)
            }
        }
    }
}