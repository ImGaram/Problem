package problems.silver

import java.io.BufferedReader
import java.io.InputStreamReader

private val tree = mutableMapOf<String, MutableList<String>>()
private val visited = mutableMapOf<String, MutableList<Boolean>>()
private var middleStart = "A"

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val case = readLine().toInt()

    for (i in 0 until case) {
        val input = readLine().split(" ")
        val parent = input[0]
        val addValue = input.subList(1, input.size).filter { it != "." }

        tree[parent] = mutableListOf()
        visited[parent] = MutableList(addValue.size) { false }
        tree[parent]!!.addAll(addValue)
    }

    println(tree)

    // 트리 순회
    // 전위 순회: 루트 -> 왼쪽 -> 오른쪽.
    frontTraversal()
    resetVisited()
    println()
    // 중위 순회: 왼쪽 자식 -> 루트 -> 오른쪽 자식.
    // 외쪽 자식을 찾아야함.
    findMiddleStart("A")
    middleTraversal(middleStart)

    // 후위 순회: 왼쪽 -> 오른쪽 -> 루트.
}

private fun frontTraversal(start: String = "A") {
    print(start)

    for (i in 0 until tree[start]!!.size) {
        if (tree[start]!!.isNotEmpty() && !visited[start]!![i]) {
            visited[start]!![i] = true

            frontTraversal(tree[start]!![i])
        }
    }
}

private fun middleTraversal(start: String) {
    println("start: $start")

    val filter = tree.filter { it.value.contains(start) }.keys
    if (start == "E") println("$start 필터: $filter")
    if (filter.isNotEmpty()) {
        if (!visited[filter.first()]!![0]) {
            visited[filter.first()]!![0] = true
            middleTraversal(filter.first())
        }
    } else {
        for (i in 0 until tree[start]!!.size) {
            if (!visited[start]!![i]) {
                findMiddleStart(tree[start]!![i])
                middleTraversal(middleStart)
            }
        }
    }
}

private fun rearTraversal() {

}

private fun findMiddleStart(start: String) {
    if (tree[start]!!.isEmpty()) return
    else {
        val firstData = tree[start]!!.first()
        middleStart = firstData
        findMiddleStart(firstData)
    }
}

private fun resetVisited() {
    for (i in visited.values) {
        i.fill(false)
    }
}