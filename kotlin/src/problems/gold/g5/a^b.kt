package problems.gold.g5

import java.io.BufferedReader
import java.io.InputStreamReader
import java.math.BigDecimal

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val input = readLine().split(" ")
    val a = BigDecimal(input[0])
    val b = input[1].toInt()
    val powValue = a.pow(b)

    println(powValue.toPlainString())
}