package problems.bronze.b1

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val n = bf.readLine().toInt()
    val a = bf.readLine().split(" ").map { it.toInt() }.toMutableList()
    a.sort()

    var i = 0
    for (num in 1 .. 1000000) {
        if (i !in a.indices) {
            println(a.last() + 1)
            break
        }

        if (a[i] == num) i++
        else {
            println(num)
            break
        }
    }
}