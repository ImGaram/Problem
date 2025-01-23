package problems.silver.s4

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val t = bf.readLine().toInt()
    val sb = StringBuilder()

    for (ti in 0 until t) {
        val n = bf.readLine().toInt()
        val str = Array(n) { "" }

        for (i in 0 until n) {
            val string = bf.readLine()
            str[i] = string
        }

        str.sortWith { s1, s2 -> if (check(s1, s2)) -1 else 1 }

        for (i in str.indices) {
            sb.append("${str[i]}\n")
        }
    }

    println(sb)
}

// str1이 더 앞선다면 true
private fun check(str1: String, str2: String): Boolean {
    val minLength = min(str1.length, str2.length)

    for (i in 0 until minLength) {
        if (str1[i] != str2[i]) {
            return if (str1[i] == '-') false
            else if (str2[i] == '-') true
            else {
                if (str1[i].lowercase() != str2[i].lowercase()) {
                    str1[i].lowercase() < str2[i].lowercase()
                } else {
                    str1[i] < str2[i]
                }
            }
        }
    }

    return str1 < str2
}