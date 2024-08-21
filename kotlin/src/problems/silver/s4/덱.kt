package problems.silver.s4

import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val command = readln().toInt()

    val deque = ArrayDeque<Int>()
    repeat(command) {
        val list = readln().split(" ")

        if (list.size == 2) {
            if (list[0] == "push_front") {
                deque.addFirst(list[1].toInt())
            } else if (list[0] == "push_back") {
                deque.addLast(list[1].toInt())
            }
        } else if (list.size == 1) {
            when(list[0]) {
                "pop_front" -> {
                    if (deque.isEmpty()) bw.write("-1\n")
                    else bw.write("${deque.removeFirst()}\n")
                }
                "pop_back" -> {
                    if (deque.isEmpty()) bw.write("-1\n")
                    else bw.write("${deque.removeLast()}\n")
                }
                "size" -> bw.write("${deque.size}\n")
                "empty" -> {
                    if (deque.isEmpty()) bw.write("1\n")
                    else bw.write("0\n")
                }
                "front" -> {
                    if (deque.isEmpty()) bw.write("-1\n")
                    else bw.write("${deque.first()}\n")
                }
                "back" -> {
                    if (deque.isEmpty()) bw.write("-1\n")
                    else bw.write("${deque.last()}\n")
                }
            }
        }
    }

    bw.flush()
    bw.close()
}