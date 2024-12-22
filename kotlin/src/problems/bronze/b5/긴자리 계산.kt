package problems.bronze.b5

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val a = bf.readLine().toBigInteger()
    val b = bf.readLine().toBigInteger()

    println(a + b)
    println(a - b)
    println(a * b)
}