package problems.silver.s3

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val n = bf.readLine().toInt()
    val code = Array(n) { Array(n) { 0 } }

    for (i in 0 until n) {
        val st = StringTokenizer(bf.readLine())

        for (j in 0 until n) {
            code[i][j] = st.nextToken().toInt()
        }
    }

    val answer = StringBuilder()
    for (i in 0 until n) {
        var tn = code[i][0]

        for (j in 1 until n) {
            tn = tn or code[i][j]
        }

        answer.append("$tn ")
    }

    println(answer)
}