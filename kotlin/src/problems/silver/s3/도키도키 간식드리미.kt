package problems.silver.s3

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Stack

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val case = readLine().toInt()
    val students = readLine().split(" ").map { it.toInt() }.toMutableList()
    val waiting = Stack<Int>()

    var currentStudent = 1
    for (i in 0 until students.size) {
        while (waiting.isNotEmpty() && waiting.peek() == currentStudent) {
            waiting.pop()
            currentStudent++
        }

        waiting.add(students[i])
    }

    for (s in 0 until waiting.size) {
        if (waiting.pop() == currentStudent) currentStudent++
        else break
    }

    if (waiting.isEmpty()) println("Nice")
    else println("Sad")
}