package problems.platinum.p4

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Stack

private data class Circle(
    val position: Int,
    val circle: String,
    var isContact: Boolean
)

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    val point = mutableListOf<Pair<Int, String>>()

    for (i in 1 .. n) {
        val (x, r) = readLine().split(" ").map { it.toInt() }
        point.add(Pair(x - r, "("))
        point.add(Pair(x + r, ")"))
    }

    point.sortByDescending { it.second }
    point.sortBy { it.first }

    var area = 1
    val stack = Stack<Circle>()
    for (i in 0 until point.size) {
        val current = point[i]

        if (i == 0) stack.add(Circle(current.first ,current.second, false))
        else {
            when (current.second) {
                "(" -> {
                    // 이전 위치와 같은 위치면 접해있는 원임.
                    if (stack.isNotEmpty() && stack.peek().position == current.first) stack[stack.lastIndex].isContact = true
                    stack.add(Circle(current.first, current.second, false))
                }
                ")" -> {
                    if (!stack.peek().isContact) area++
                    else area += 2
                    stack.pop()

                    if (i + 1 in 0 until point.size) {
                        val next = point[i + 1]
                        // 다음 원과 접해 있지 않을 때
                        if (stack.isNotEmpty() && next.first != current.first) stack[stack.lastIndex].isContact = false
                    }
                }
            }
        }
    }

    println(area)
}