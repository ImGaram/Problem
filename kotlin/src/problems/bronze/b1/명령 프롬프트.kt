package problems.bronze.b1

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    val commands = mutableListOf<String>()
    val answer = StringBuilder()

    for (i in 0 until n) {
        val cmd = readLine()
        commands.add(cmd)
    }

    for (i in 0 until commands[0].length) {
        val str = commands.map { it[i] }
        var same = true

        for (j in 1 until str.size) {
            if (str[j - 1] != str[j]) same = false
        }

        if (same) answer.append(str[0])
        else answer.append("?")
    }

    println(answer)
}