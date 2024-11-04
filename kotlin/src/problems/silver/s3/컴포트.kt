package problems.silver.s3

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val (n, z, m) = bf.readLine().split(" ").map { it.toInt() }
    val ms = bf.readLine().split(" ").map { it.toInt() }

    for (k in 1 until z) {
        var location = 1
        var isContains = false
        val move = mutableListOf<Int>()

        while (location != z) {
            if (ms.contains(location) || move.contains(location)) {
                isContains = true
                break
            }

            move.add(location)
            location += k

            if (location > n) location -= n
        }

        if (!isContains) {
            println(k)
            break
        }
    }
}