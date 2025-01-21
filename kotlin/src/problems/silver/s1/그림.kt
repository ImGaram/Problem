package problems.silver.s1

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

private var paint = arrayOf(listOf<Int>())
private var visited = arrayOf(booleanArrayOf())

private val dx = listOf(0, 0, 1, -1)
private val dy = listOf(1, -1, 0, 0)

private var paintCnt = 0
private var paintArea = 1

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val (n, m) = bf.readLine().split(" ").map { it.toInt() }
    paint = Array(n) { listOf() }
    visited = Array(n) { BooleanArray(m) }

    for (i in 0 until n) {
        val paintLine = bf.readLine().split(" ").map { it.toInt() }
        paint[i] = paintLine
    }

    var answer = 0
    for (i in paint.indices) {
        for (j in paint[i].indices) {
            if (!visited[i][j] && paint[i][j] == 1) {
                visited[i][j] = true

                paintCnt++
                paintArea = 1

                dfs(i, j)

                answer = max(answer, paintArea)
            }
        }
    }

    println(paintCnt)
    println(answer)
}

private fun dfs(y: Int, x: Int) {
    for (i in dx.indices) {
        val mx = x + dx[i]
        val my = y + dy[i]

        if (my in paint.indices && mx in paint[my].indices) {
            if (!visited[my][mx] && paint[my][mx] == 1) {
                visited[my][mx] = true

                paintArea++
                dfs(my, mx)
            }
        }
    }
}