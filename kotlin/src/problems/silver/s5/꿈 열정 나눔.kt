package problems.silver.s5

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val me = readLine().split(" ").map { it.toInt() }.sum()
    val students = mutableListOf<Pair<Int, List<Int>>>()

    for (i in 1 .. n) {
        students.add(Pair(i, readLine().split(" ").map { it.toInt() }))
    }
    students.sortByDescending { it.second.sum() }

    val answer = mutableListOf(0)
    for (i in students) {
        if (answer.size < m && i.second.sum() <= me) {
            answer.add(i.first)
        }
    }

    println(answer.joinToString(" "))
}