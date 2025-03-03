package problems.silver.s3

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.PriorityQueue
import java.util.StringTokenizer

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val n = bf.readLine().toInt()
    val priorityQueue = PriorityQueue<Int>(reverseOrder())

    for (ni in 0 until n) {
        val a = StringTokenizer(bf.readLine())
        val query = a.nextToken().toInt()

        if (query == 0) {
            if (priorityQueue.isEmpty()) println(-1)
            else println(priorityQueue.remove())
        } else {
            for (i in 0 until query) {
                val present = a.nextToken().toInt()
                priorityQueue.add(present)
            }
        }
    }
}