package problems.silver.s3

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val n = bf.readLine().toInt()
    val a = bf.readLine().split(" ").map { it.toInt() }.toTypedArray()
    val x = bf.readLine().toInt()

    a.sort()

    var answer = 0
    var start = 0
    var end = n - 1
    while (start < end) {
        val res = a[start] + a[end]

        if (res > x) {
            end--
            start = 0
        }
        else if (res == x) {
            answer++
            end--
        } else start++
    }

    println(answer)
}