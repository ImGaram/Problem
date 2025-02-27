package problems.silver.s5

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.Queue

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val find = bf.readLine()
    val n = bf.readLine().toInt()
    var answer = 0

    for (ni in 0 until n) {
        val queue: Queue<String> = LinkedList()
        val ring = bf.readLine()

        queue.addAll(ring.map { it.toString() })

        if (queue.joinToString("").contains(find)) {
            answer++
            continue
        }

        for (i in 1 until ring.length) {
            val removeValue = queue.remove()
            queue.add(removeValue)

            if (queue.joinToString("").contains(find)) {
                answer++
                break
            }
        }
    }

    println(answer)
}