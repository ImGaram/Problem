package problems.silver

import java.util.Stack
import kotlin.system.exitProcess

fun main() {
    val cnt = readln().toInt()

    val arr = IntArray(cnt)
    repeat(cnt) { arr[it] = readln().toInt() }

    val tempStack = Stack<Int>()
    val tempArr = arrayListOf<String>()
    var data = 1
    for (i in arr.indices) {
        while (data <= arr[i]) { // 4 ( 1 2 3 4
            tempStack.add(data)
            tempArr.add("+")
            data+=1
        }
        if (tempStack.peek() == arr[i]) {
            tempStack.pop()
            tempArr.add("-")
        } else {
            println("NO")
            exitProcess(0)
        }
    }

    repeat(tempArr.size) { println(tempArr[it]) }
}