package problems.bronze.b1

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val n = bf.readLine().toInt()
    val strShape = mutableListOf<String>()

    for (ni in 0 until n) {
        val s = bf.readLine()
        strShape.add(s)
    }

    var answer = "YES"
    for (i in strShape.indices) {
        val row = strShape[i]
        val column = strShape.map { it[i] }.joinToString("")

        if (row != column) {
            answer = "NO"
            break
        }
    }

    println(answer)
}