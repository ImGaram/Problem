package problems.gold

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.ArrayDeque

private val queue = ArrayDeque<List<Int>>()
private var box = arrayOf<Array<MutableList<Int>>>()

private val dx = listOf(-1, 1, 0, 0, 0, 0)
private val dy = listOf(0, 0, -1, 1, 0, 0)
private val dz = listOf(0, 0, 0, 0, -1, 1)

private var currentDay = 0

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (x, y, z) = readLine().split(" ").map { it.toInt() }
    box = Array(z) { Array(y) { mutableListOf() } }

    for (i in 0 until z) {
        for (j in 0 until y) {
            val tomato = readLine().split(" ").map { it.toInt() }
            box[i][j].addAll(tomato)

            for (k in tomato.indices) {
                if (tomato[k] == 1) {
                    queue.addFirst(listOf(k, j, i, 0))
                }
            }
        }
    }

    bfs()

    for (i in box.indices) {
        for (j in box[i].indices) {
            if (box[i][j].contains(0)) {
                currentDay = -1
                break
            }
        }
    }

    println(currentDay)
}

private fun bfs() {
    while (queue.isNotEmpty()) {
        val data = queue.removeLast()
        currentDay = data.last()

        find(data[0], data[1], data[2])
    }
}

private fun find(x: Int, y: Int, z: Int) {
    for (i in dx.indices) {
        val mx = x + dx[i]
        val my = y + dy[i]
        val mz = z + dz[i]

        if (mz in box.indices && my in box[0].indices && mx in box[0][0].indices) {
            if (box[mz][my][mx] == 0) {
                box[mz][my][mx] = 1
                queue.addFirst(listOf(mx, my, mz, currentDay + 1))
            }
        }
    }
}