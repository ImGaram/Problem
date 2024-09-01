package problems.silver.s2

import java.io.BufferedReader
import java.io.InputStreamReader

private var campus = arrayOf<List<String>>()
private var visited = arrayOf<BooleanArray>()
private var meetPersonCnt = 0

private val dx = listOf(-1, 1, 0, 0)
private val dy = listOf(0, 0, -1, 1)

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (h, w) = readLine().split(" ").map { it.toInt() }

    campus = Array(h) { List(w) { "" } }
    visited = Array(h) { BooleanArray(w) }

    var startPoint = listOf<Int>()
    for (i in 0 until h) {
        val map = readLine().map { it.toString() }
        campus[i] = map

        for (j in map.indices) {
            if (map[j] == "I") startPoint = listOf(i, j)
        }
    }

    bfs(startPoint[1], startPoint[0])

    if (meetPersonCnt == 0) println("TT")
    else println(meetPersonCnt)
}

private fun bfs(x: Int, y: Int) {
    for (i in dx.indices) {
        val mx = x + dx[i]
        val my = y + dy[i]

        if (mx in campus[0].indices && my in campus.indices) {
            if (!visited[my][mx] && campus[my][mx] != "X") {
                visited[my][mx] = true
                if (campus[my][mx] == "P") meetPersonCnt++
                bfs(mx, my)
            }
        }
    }
}