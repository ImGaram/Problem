package problems.bronze.b4

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val (s, k, h) = bf.readLine().split(" ").map { it.toInt() }

    if (s + k + h >= 100) println("OK")
    else {
        val list = listOf(s, k, h)

        if (list.min() == s) {
            println("Soongsil")
        } else if (list.min() == k) {
            println("Korea")
        } else {
            println("Hanyang")
        }
    }
}