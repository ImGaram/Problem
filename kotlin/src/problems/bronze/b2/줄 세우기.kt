package problems.bronze.b2

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val n = bf.readLine().toInt()
    val list = mutableListOf<Int>()
    val students = bf.readLine().split(" ").map { it.toInt() }

    for (sn in 1 .. n) {
        val choose = students[sn - 1]
        list.add(choose, sn)
    }

    for (i in list.lastIndex downTo 0) {
        print("${list[i]} ")
    }
}