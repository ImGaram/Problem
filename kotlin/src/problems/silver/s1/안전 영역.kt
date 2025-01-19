package problems.silver.s1

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

private var map = arrayOf<List<Int>>()
private var visited = arrayOf(booleanArrayOf())
private val dx = listOf(-1, 1, 0, 0)
private val dy = listOf(0, 0, -1, 1)

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val n = bf.readLine().toInt()
    map = Array(n) { listOf() }
    visited = Array(n) { BooleanArray(n) }

    var maxH = 0
    for (i in 0 until n) {
        val ln = bf.readLine().split(" ").map { it.toInt() }
        map[i] = ln

        maxH = max(maxH, ln.max())
    }

    var answer = 0
    for (h in 0 until maxH) {
        var safeArea = 0

        for (i in visited.indices) {
            visited[i].fill(false)
        }

        for (i in map.indices) {
            for (j in map[i].indices) {
                if (!visited[i][j] && map[i][j] > h) {
                    visited[i][j] = true
                    safeArea++
                    dfs(j, i, h)
                }
            }
        }

        answer = max(answer, safeArea)
    }

    println(answer)
}

private fun dfs(x: Int, y: Int, h: Int) {
    for (i in dx.indices) {
        val mx = dx[i] + x
        val my = dy[i] + y

        if (my in map.indices && mx in map[my].indices) {
            if (!visited[my][mx] && map[my][mx] > h) {
                visited[my][mx] = true
                dfs(mx, my, h)
            }
        }
    }
}