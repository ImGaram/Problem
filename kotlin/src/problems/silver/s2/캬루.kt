package problems.silver.s2

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val t = bf.readLine().toInt()

    for (i in 0 until t) {
        val sb = StringBuilder()
        val (n, p) = bf.readLine().split(" ")

        if (n == "1") sb.append("4 2\n")
        else {
            for (j in p.indices) {
                val arr = p.toCharArray()
                val sum = arr.sumOf { it.digitToInt() }
                val res = arr[j].digitToInt() - sum % 3

                if (res <= 0) arr[j] = (res + 3).digitToChar()
                else arr[j] = res.digitToChar()

                sb.append("${arr.joinToString("")} 3\n")
            }
        }

        println(sb)
    }
}