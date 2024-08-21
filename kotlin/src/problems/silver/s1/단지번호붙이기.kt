package problems.silver.s1

import java.io.BufferedReader
import java.io.InputStreamReader

private val dx = listOf(-1,1,0,0)
private val dy = listOf(0,0,-1,1)

private var graph = arrayOf<MutableList<Int>>()
private var visited = arrayOf<Array<Boolean>>()
private var apartment = 0

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val size = readLine().toInt()
    val apartments = mutableListOf<Int>()
    var apartmentComplex = 0

    graph = Array(size) { mutableListOf() }
    visited = Array(size) { Array(size) { false } }

    for (i in 0 until size) {
        val list = readLine().map { it.digitToInt() }
        graph[i].addAll(list)
    }

    for (i in graph.indices) {
        for (j in graph[i].indices) {
            if (graph[i][j] == 1 && !visited[i][j]) {
                apartment = 1
                visited[i][j] = true
                dfs(i, j)
                apartmentComplex++
                apartments.add(apartment)
            }
        }
    }

    apartments.sort()
    println(apartmentComplex)
    println(apartments.joinToString("\n"))
}

private fun dfs(x: Int, y: Int) {
    for (i in dx.indices) {
        val nx = x +dx[i]
        val ny = y +dy[i]

        if (nx in graph.indices && ny in graph.indices) {
            if (graph[nx][ny] == 1 && !visited[nx][ny]) {
                visited[nx][ny] = true
                apartment++
                dfs(nx, ny)
            }
        }
    }
}