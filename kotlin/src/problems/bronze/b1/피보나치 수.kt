package problems.bronze.b1

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val num = readLine().toInt()
    val list = Array(num + 1) { 0.toBigInteger() }

    list[1] = 1.toBigInteger()
    for (i in 2 .. num) {
        list[i] = list[i-1] + list[i-2]
    }

    println(list.last())
}