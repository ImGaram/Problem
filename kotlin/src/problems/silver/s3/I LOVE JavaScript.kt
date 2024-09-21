package problems.silver.s3

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Stack

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val ason = readLine().split(" ")
    val stack = Stack<String>()
    var totalByte = 0
    var objectByte = 0

    for (i in ason.indices) {
        if (ason[i] == "]") {
            while (stack.peek() != "[") {
                try {
                    stack.peek().toLong()
                    objectByte += 8
                } catch (e: Exception) {
                    val stringData = stack.peek()
                    objectByte += stringData.length + 12
                }

                stack.pop()
            }

            stack.pop()
            totalByte += objectByte + 8
            objectByte = 0
        } else {
            stack.add(ason[i])
        }
    }

    println(totalByte)
}