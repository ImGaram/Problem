package problems.bronze.b2

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val pow = 2.toBigDecimal().pow(bf.readLine().toInt())
    val value = 1.toBigDecimal()

    println(value.divide(pow).toPlainString())
}