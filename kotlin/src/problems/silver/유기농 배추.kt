package problems.silver

import java.io.BufferedReader
import java.io.InputStreamReader

private var width: Int = 0
private var height: Int = 0
private var cabbage: Int = 0

private var graph = arrayOf<Array<Int>>()
private var visited = arrayOf<Array<Boolean>>()
// dx, dy: 근처 상하좌우에 배추가 있는지 확인하기 위함.
private val dx = listOf(-1,1,0,0)
private val dy = listOf(0,0,-1,1)

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val case = readLine().toInt()

    for (i in 0 until case) {
        val input = readLine().split(" ").map { it.toInt() }
        width = input[0]
        height = input[1]
        cabbage = input[2]

        graph = Array(width) { Array(height) { 0 } }
        visited = Array(width) { Array(height) { false } }

        // 배추흰지렁이의 개수
        var cnt = 0

        // 그래프에 배추가 심어진 부분을 1로 설정함
        for (j in 0 until cabbage) {
            val (x, y) = readLine().split(" ").map { it.toInt() }
            graph[x][y] = 1
        }

        // graph의 모든 부분을 탐색한다.
        for (x in 0 until width) {
            for (y in 0 until height) {
                // graph[x][y]가 1이고(배추가 심어져 있음), 방문하지 않은 곳일 때
                if (graph[x][y] == 1 && !visited[x][y]) {
                    visited[x][y] = true
                    find(x, y)
                    cnt++
                }
            }
        }

        println(cnt)
    }
}

// graph[x][y] 주변(상하좌우)의 데이터가 1인지 체크하기 위한 함수.
private fun find(x: Int, y: Int) {
    for (i in dx.indices) {
        // 체크할 데이터들 index
        val nx = x+dx[i]
        val ny = y+dy[i]

        // graph의 범위를 벗어나면 안됨.
        if (nx in 0 ..< width && ny in 0 ..< height) {
            // graph[nx][ny]가 1이고, 방문하지 않았을 때
            if (graph[nx][ny] == 1 && !visited[nx][ny]) {
                // 방문 처리 후 재귀
                visited[nx][ny] = true
                find(nx, ny)
            }
        }
    }
}
