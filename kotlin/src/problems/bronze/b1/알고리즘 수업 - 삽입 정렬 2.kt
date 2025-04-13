package problems.bronze.b1

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val (n, k) = bf.readLine().split(" ").map { it.toInt() }
    val arr = bf.readLine().split(" ").map { it.toInt() }.toTypedArray()
    var cnt = 0
    var res = "-1"

    for (i in 1 until n) {
        val d = arr[i]
        var index = i - 1

        while (index >= 0 && d < arr[index]) {
            arr[index + 1] = arr[index]
            index--

            cnt++
            if (cnt == k) {
                res = arr.joinToString(" ")
                break
            }
        }

        if (index + 1 != i) {
            arr[index + 1] = d
            cnt++

            if (cnt == k) {
                res = arr.joinToString(" ")
                break
            }
        }
    }

    println(res)
}