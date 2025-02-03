package problems.silver.s4

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val n = bf.readLine().toInt()
    val deque = ArrayDeque<Int>()
    val sb = StringBuilder()

    for (i in 0 until n) {
        val query = bf.readLine().split(" ").map { it.toInt() }

        when (query.first()) {
            1 -> {
                deque.addFirst(query.last())
            }
            2 -> {
                deque.add(query.last())
            }
            3 -> {
                if (deque.isNotEmpty()) sb.append("${deque.removeFirst()}\n")
                else sb.append("-1\n")
            }
            4 -> {
                if (deque.isNotEmpty()) sb.append("${deque.removeLast()}\n")
                else sb.append("-1\n")
            }
            5 -> {
                sb.append("${deque.size}\n")
            }
            6 -> {
                if (deque.isNotEmpty()) sb.append("0\n")
                else sb.append("1\n")
            }
            7 -> {
                if (deque.isNotEmpty()) sb.append("${deque.first()}\n")
                else sb.append("-1\n")
            }
            8 -> {
                if (deque.isNotEmpty()) sb.append("${deque.last()}\n")
                else sb.append("-1\n")
            }
        }
    }

    println(sb)
}