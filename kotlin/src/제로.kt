import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Stack

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val count = bf.readLine().toInt()

    val stack = Stack<Int>()
    for (i in 1..count) {
        val num = bf.readLine().toInt()
        if (num == 0) {
            stack.pop()
            continue
        }
        stack.push(num)
    }

    var total = 0
    repeat(stack.size) {
        total += stack.pop()
    }
    println(total)
}