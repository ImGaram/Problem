package problems.silver.s5

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val qwerty = listOf(
        listOf('`', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '-', '='),
        listOf('Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P', '[', ']', '\\'),
        listOf('A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L', ';', '\''),
        listOf('Z', 'X', 'C', 'V', 'B', 'N', 'M', ',', '.', '/')
    )
    val answer = StringBuilder()

    while (true) {
        val str = bf.readLine() ?: break
        if (answer.isNotEmpty()) answer.append("\n")

        for (c in str) {
            if (c == ' ') answer.append(" ")
            else {
                for (i in qwerty.indices) {
                    for (j in qwerty[i].indices) {
                        if (qwerty[i][j] == c) answer.append(qwerty[i][j - 1])
                    }
                }
            }
        }
    }

    println(answer)
}