package problems.bronze.b1

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val case = readLine().toInt()
    var palindrome = 0

    for (i in 0 until case) {
        val s = readLine().map { it.toString() }.toMutableList()

        while (s.isNotEmpty()) {
            if (s.first() == s.last()) {
                s.removeFirst()
                s.removeLast()
            } else break
        }

        if (s.isEmpty()) palindrome++
    }

    println(palindrome * (palindrome - 1))
}