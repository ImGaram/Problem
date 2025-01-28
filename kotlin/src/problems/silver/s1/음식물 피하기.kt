package problems.silver.s1

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

private var passage = arrayOf(arrayOf<Int>())
private var visited = arrayOf(booleanArrayOf())

private val dx = listOf(0, 0, -1, 1)
private val dy = listOf(-1, 1, 0, 0)

private var waste = 0

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val (n, m, k) = bf.readLine().split(" ").map { it.toInt() }
    passage = Array(n + 1) { Array(m + 1) { 0 } }
    visited = Array(n + 1) { BooleanArray(m + 1) }

    for (i in 0 until k) {
        val (r, c) = bf.readLine().split(" ").map { it.toInt() }
        passage[r][c] = 1
    }

    var answer = 0
    for (i in 1 until passage.size) {
        for (j in 1 until passage[i].size) {
            if (!visited[i][j] && passage[i][j] == 1) {
                visited[i][j] = true

                waste = 1
                bfs(i, j)

                answer = max(answer, waste)
            }
        }
    }

    println(answer)
}

private fun bfs(y: Int, x: Int) {
    for (i in dx.indices) {
        val mx = x + dx[i]
        val my = y + dy[i]

        if (my in passage.indices && mx in passage[my].indices) {
            if (!visited[my][mx] && passage[my][mx] == 1) {
                visited[my][mx] = true
                waste++

                bfs(my, mx)
            }
        }
    }
}