import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
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
                    if (queue.isEmpty()) bw.write("-1\n")
                    else bw.write("${queue.poll()}\n")
                }
                "size" -> bw.write("${queue.size}\n")
                "empty" -> {
                    if (queue.isEmpty()) bw.write("1\n")
                    else bw.write("0\n")
                }
                "front" -> {
                    if (queue.isEmpty()) bw.write("-1\n")
                    else bw.write("${queue.peek()}\n")
                }
                "back" -> {
                    if (queue.isEmpty()) bw.write("-1\n")
                    else bw.write("${queue.last()}\n")
                }
            }
        }
    }

    bf.close()
    bw.flush()
    bw.close()
}