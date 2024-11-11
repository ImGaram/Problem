package problems.silver.s2

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val (_, k) = bf.readLine().split(" ").map { it.toInt() }
    val list = bf.readLine().split(" ").map { it.toLong() }.toLongArray()
    list.sort()

    for (i in 0 until k) {
        val (l, r, x) = bf.readLine().split(" ").map { it.toInt() }

        for (j in l - 1 until r) {
            list[j] = list[j] + x
        }
        list.sort()
    }

    println(list.joinToString(" "))
}