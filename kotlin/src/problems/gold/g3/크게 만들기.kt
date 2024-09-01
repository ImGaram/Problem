package problems.gold.g3

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Stack

private val stack = Stack<Int>()

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (addCnt, removeCnt) = readLine().split(" ").map { it.toInt() }
    val number = readLine().map { it.digitToInt() }

    var toRemoveCnt = 0
    for (i in number.indices) {
        while (stack.isNotEmpty() && toRemoveCnt != removeCnt && stack.peek() < number[i]) {
            stack.pop()
            toRemoveCnt++
        }

        if (stack.size < addCnt - removeCnt) stack.add(number[i])
    }

    println(stack.joinToString(""))
}