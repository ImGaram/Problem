package problems.silver.s4

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.Queue

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val n = bf.readLine().toInt()

    val line: Queue<Pair<Int, Int>> = LinkedList()
    val resA = mutableListOf<Int>()
    val resB = mutableListOf<Int>()
    val resC = mutableListOf<Int>()

    for (ni in 0 until n) {
        val s = bf.readLine().split(" ").map { it.toInt() }

        when (s.first()) {
            1 -> {
                val a = s[1]
                val b = s[2]

                line.add(Pair(a, b))
            }
            2 -> {
                val b = s[1]
                val student = line.remove()

                if (student.second == b) resA.add(student.first)
                else resB.add(student.first)
            }
        }
    }

    while (line.isNotEmpty()) {
        resC.add(line.remove().first)
    }

    resA.sort()
    resB.sort()
    resC.sort()

    println(if (resA.isEmpty()) "None" else resA.joinToString(" "))
    println(if (resB.isEmpty()) "None" else resB.joinToString(" "))
    println(if (resC.isEmpty()) "None" else resC.joinToString(" "))
}