import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Stack

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val cmdCnt = bf.readLine().toInt()

    val stack = Stack<Int>()
    repeat(cmdCnt) {
        val command = bf.readLine().split(" ")

        if (command.size == 2) {
            if (command[0] == "push") {
                stack.push(command[1].toInt())
            }
        } else if (command.size == 1) {
            when(command[0]) {
                "pop" -> {
                    if (stack.isEmpty()) println(-1)
                    else println(stack.pop())
                }
                "size" -> println(stack.size)
                "empty" -> {
                    if (stack.isEmpty()) println(1)
                    else println(0)
                }
                "top" -> {
                    if (stack.isEmpty()) println(-1)
                    else println(stack.peek())
                }
            }
        }
    }

    bf.close()
}