package problems.silver.s1

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.math.abs

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val numbers = readLine().toInt()
    // o1, o2를 절댓값으로 비교 후 같으면 더 작은 수가 우선순위, 다르면 절댓값이 더 작은 순으로 정렬한다.
    val priorityQueue = PriorityQueue<Int> { o1, o2 ->
        if (abs(o1) == abs(o2)) o1 - o2 else abs(o1) - abs(o2)
    }
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