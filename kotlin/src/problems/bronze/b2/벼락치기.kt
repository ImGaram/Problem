package problems.bronze.b2

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val n = bf.readLine().toLong()

    if (n == 1L) println(1)
    else if (n <= 3) println(2)
    else if (n <= 6) println(3)
    else if (n <= 10) println(4)
    else if (n <= 15) println(5)
    else if (n <= 21) println(6)
    else println((n - 22) / 7 + 7)
}