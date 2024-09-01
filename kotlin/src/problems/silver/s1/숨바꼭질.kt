package problems.silver.s1

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

private val array = Array(100001) { -1 }
private var start = 0
private var end = 0

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val input = readLine().split(" ").map { it.toInt() }
    start = input[0]
    end = input[1]
    array[start] = 0

    if (start == 0 && end == 0) {
        println(0)
        return
    }

    bfs(start)
}

private fun bfs(start: Int) {
    val queue: Queue<Int> = LinkedList()
    queue.add(start)
    array[start] = 0

    while (queue.isNotEmpty()) {
        val startPoint = queue.remove()
        if (startPoint == end) {
            println(array[startPoint])
            break
        }
        if (startPoint * 2 < array.size && array[startPoint * 2] == -1) {
            queue.add(startPoint * 2)
            array[startPoint * 2] = array[startPoint] + 1
        }
        if (startPoint + 1 < array.size && array[startPoint + 1] == -1) {
            queue.add(startPoint + 1)
            array[startPoint + 1] = array[startPoint] + 1
        }
        if (startPoint - 1 >= 0 && array[startPoint - 1] == -1) {
            queue.add(startPoint - 1)
            array[startPoint - 1] = array[startPoint] + 1
        }
    }
}