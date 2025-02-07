package problems.silver.s3

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val n = bf.readLine().toInt()

    var c = 0
    for (i in n - 1 downTo 1) {
        c++

        if (n % i == 0) break
    }

    println(c)
}
//1000000000