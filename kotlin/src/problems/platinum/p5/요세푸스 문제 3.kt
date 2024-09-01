package problems.platinum.p5

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (n, k) = readLine().split(" ").map { it.toInt() }
    var data = 1

    for (i in 1 .. n) {
        data = (data + k - 1) % i + 1
    }

    println(data)
}