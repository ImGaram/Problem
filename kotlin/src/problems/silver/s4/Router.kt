package problems.silver.s4

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val size = readLine().toInt()
    val queue: Queue<Int> = LinkedList()

    while (true) {
        val num = readLine().toInt()
        if (num == -1) break

        if (num == 0) {
            queue.poll()
        } else {
            if (queue.size < size) queue.add(num)
        }
    }

    println(queue.joinToString(" "))
}