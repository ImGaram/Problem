package problems.silver.s2

import java.io.BufferedReader
import java.io.InputStreamReader

private val fibonacci = Array(100001) { 0.toBigInteger() }

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val case = readLine().toInt()

    fibonacci[1] = 1.toBigInteger()
    for (i in 2 until fibonacci.size) {
        fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2]
    }

    for (i in 0 until case) {
        val fibonacciNum = readLine().toBigInteger()

        for (j in 2 until fibonacci.size) {
            if (fibonacci[j] == fibonacciNum) {
                println(j)
                break
            }
        }
    }
}