package problems.silver.s5

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val n = bf.readLine().toInt()

    for (i in 0 until n) {
        val m = bf.readLine().toInt()
        val left = bf.readLine().split(" ").map { it.toInt() }.toMutableList()
        val right = bf.readLine().split(" ").map { it.toInt() }.toMutableList()
        var answer = 0

        while (left.isNotEmpty()) {
            val start = left.first()
            if (left.contains(start + 500) && right.contains(start + 1000) && right.contains(start + 1500)) {
                answer++

                left.remove(start + 500)
            }

            left.removeFirst()
        }

        println(answer)
    }
}