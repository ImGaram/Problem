package problems.silver.s4

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val case = readLine().toInt()
    val chatting = mutableSetOf<String>()

    var sayHiCnt = 0
    for (i in 0 until case) {
        val alert = readLine()
        if (alert == "ENTER") {
            sayHiCnt += chatting.size
            chatting.clear()
        } else chatting.add(alert)
    }
    sayHiCnt += chatting.size

    println(sayHiCnt)
}