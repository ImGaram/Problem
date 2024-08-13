package problems.silver

import java.io.BufferedReader
import java.io.InputStreamReader

private var res = arrayOf<Int>()
private var visited = booleanArrayOf()
private var num = 0
private var size = 0

private val sb = StringBuilder()

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val input = readLine().split(" ").map { it.toInt() }
    num = input.first()
    size = input.last()
    res = Array(size) { 0 }
    visited = BooleanArray(num)

    dfs(0)

    println(sb)
}

private fun dfs(depth: Int) {
    if (depth == size) {
        for (r in res) {
            sb.append("$r ")
        }
        sb.append("\n")
        return
    }

    for (i in 0 until num) {
        if (!visited[i]) {
            visited[i] = true
            res[depth] = i+1
            dfs(depth + 1)

            visited[i] = false
        }
    }
}