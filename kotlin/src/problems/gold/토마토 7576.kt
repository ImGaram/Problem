package problems.gold

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.ArrayDeque

private var box = arrayOf<MutableList<Int>>()
private var findDay = 0

private val queue = ArrayDeque<List<Int>>()
private val dx = listOf(-1, 1, 0, 0)
private val dy = listOf(0, 0, -1, 1)

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (width, height) = readLine().split(" ").map { it.toInt() }

    box = Array(height) { mutableListOf() }


    for (i in 0 until height) {
        val input = readLine().split(" ").map { it.toInt() }

        box[i].addAll(input)
        for (j in input.indices) {
            if (box[i][j] == 1) {
                queue.add(listOf(i, j, 0))
            }
        }
    }

    bfs()

    for (i in box.indices) {
        if (box[i].contains(0)) {
            findDay = -1
            break
        }
    }
    println(findDay)
}

private fun bfs() {
    while (queue.isNotEmpty()) {
        val data = queue.removeLast()
        findDay = data[2]

        findData(data[0], data[1])
    }
}

private fun findData(h: Int, w: Int) {
    for (i in dx.indices) {
        val mw = w + dx[i]
        val mh = h + dy[i]

        if (mw in box[0].indices && mh in box.indices) {
            if (box[mh][mw] == 0) {
                box[mh][mw] = 1
                queue.addFirst(listOf(mh, mw, findDay + 1))
            }
        }
    }
}