package main.kotlin.level_3

class `네트워크` {
    private var visited = booleanArrayOf()
    private var graph = arrayOf<IntArray>()
    private var answer = 0

    fun solution(n: Int, computers: Array<IntArray>): Int {
        graph = computers
        visited = BooleanArray(n)

        for (i in graph.indices) {
            if (!visited[i]) {
                answer++
                dfs(i)
            }
        }

        return answer
    }

    private fun dfs(num: Int) {
        visited[num] = true
        val data = graph[num]

        for (n in data.indices) {
            if (!visited[n] && data[n] == 1) {
                visited[n] = true
                dfs(n)
            }
        }
    }
}

fun main() {
    네트워크().solution(
        3, arrayOf(intArrayOf(1, 1, 0), intArrayOf(1, 1, 0), intArrayOf(0, 0, 1))
    )
}