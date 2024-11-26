package problems.silver.s3

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val m = bf.readLine().toInt()
    val sb = StringBuilder()
    var sum = 0L
    var xor = 0

    for (i in 0 until m) {
        val query = bf.readLine().split(" ").map { it.toInt() }

        when (query[0]) {
            1 -> {
                sum += query[1]
                xor = xor xor query[1]
            }
            2 -> {
                sum -= query[1]
                xor = xor xor query[1]
            }
            3 -> sb.append("${sum}\n")
            4 -> sb.append("${xor}\n")
        }
    }

    println(sb)
}