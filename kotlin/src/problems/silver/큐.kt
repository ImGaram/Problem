import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val cmdCnt = bf.readLine().toInt()

    val queue: Queue<Int> = LinkedList()
    repeat(cmdCnt) {
        val command = bf.readLine().split(" ")

        if (command.size == 2) {
            if (command[0] == "push") {
                queue.add(command[1].toInt())
            }
        } else if (command.size == 1) {
            when(command[0]) {
                "pop" -> {
                    if (queue.isEmpty()) println(-1)
                    else println(queue.poll())
                }
                "size" -> println(queue.size)
                "empty" -> {
                    if (queue.isEmpty()) println(1)
                    else println(0)
                }
                "front" -> {
                    if (queue.isEmpty()) println(-1)
                    else println(queue.peek())
                }
                "back" -> {
                    if (queue.isEmpty()) println(-1)
                    else println(queue.last())
                }
            }
        }
    }
}