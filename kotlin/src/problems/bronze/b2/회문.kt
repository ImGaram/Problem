package problems.bronze.b2

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val t = bf.readLine().toInt()
    val answer = StringBuilder()

    for (ii in 0 until t) {
        val (a, n) = bf.readLine().split(" ").map { it.toLong() }
        val format = a.toString(n.toInt())
        var palindrome = 1

        for (i in 0 until format.length / 2) {
            if (format[i] != format[format.lastIndex - i]) {
                palindrome = 0
                break
            }
        }

        answer.append("$palindrome\n")
    }

    println(answer)
}