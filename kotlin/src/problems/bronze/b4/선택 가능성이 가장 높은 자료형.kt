package problems.bronze.b4

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val n = bf.readLine().toLong()

    when (n) {
        in -32768 .. 32767 -> println("short")
        in -2147483648 .. 2147483647 -> println("int")
        else -> println("long long")
    }
}