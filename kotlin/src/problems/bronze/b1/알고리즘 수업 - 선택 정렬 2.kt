package problems.bronze.b1

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val (n, k) = bf.readLine().split(" ").map { it.toInt() }
    val arr = bf.readLine().split(" ").map { it.toInt() }.toMutableList()
    var cnt = 0
    var answer = "-1"

    for (i in n downTo 2) {
        val subList = arr.subList(0, i)
        val maxIndex = subList.indexOf(subList.max())

        if (maxIndex != i - 1) {
            val temp = arr[maxIndex]
            arr[maxIndex] = arr[i - 1]
            arr[i - 1] = temp

            cnt++
        }

        if (cnt == k) answer = arr.joinToString(" ")
    }

    println(answer)
}