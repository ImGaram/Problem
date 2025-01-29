package problems.bronze.b1

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val (n, k) = bf.readLine().split(" ").map { it.toInt() }
    val arr = bf.readLine().split(" ").map { it.toInt() }.toTypedArray()
    var answer = ""
    var cnt = 0

    for (i in 0 until n) {
        for (j in 0 until n - i - 1) {
            if (arr[j] > arr[j + 1]) {
                val temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp

                cnt++

                if (cnt == k) {
                    answer = arr.joinToString(" ")
                    println(answer)

                    return
                }
            }
        }
    }

    if (answer.isEmpty()) println(-1)
}