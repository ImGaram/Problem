package problems.bronze.b1

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val size = readLine().toInt()
    val code = readLine()
    val parsing = Array(code.length / size) { Array(size) { "" } }

    var index = 0
    for (i in parsing.indices) {
        if (i % 2 == 0) {
            for (j in 0 until parsing[i].size) {
                parsing[i][j] = code[index].toString()
                index++
            }
        } else {
            for (j in parsing[i].lastIndex downTo 0) {
                parsing[i][j] = code[index].toString()
                index++
            }
        }
    }

    var answer = ""
    for (i in 0 until parsing[0].size) {
        for (j in parsing.indices) {
            answer += parsing[j][i]
        }
    }

    println(answer)
}