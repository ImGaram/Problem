package problems.silver.s2

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val numbers = readLine().toInt()
    val priorityQueue = PriorityQueue<Int>()
    val printValue = StringBuilder()

    for (i in 0 until numbers) {
        val number = readLine().toInt()
        if (number == 0) {
            if (priorityQueue.isEmpty()) printValue.append(0).append("\n")
            else printValue.append(priorityQueue.poll()).append("\n")
        } else priorityQueue.offer(number)
    }

    println(printValue)
}