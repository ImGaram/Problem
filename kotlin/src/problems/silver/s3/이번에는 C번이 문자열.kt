package problems.silver.s3

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val (n, m, k) = bf.readLine().split(" ").map { it.toInt() }
    val sList = mutableListOf<String>()

    for (ni in 0 until n) {
        val s = bf.readLine().toCharArray()
        s.sort()

        sList.add(s.joinToString(""))
    }
    sList.sort()

    var join = ""
    for (i in 0 until k) {
        join += sList[i]
    }
    val res = join.toCharArray()
    res.sort()

    println(res.joinToString(""))
}