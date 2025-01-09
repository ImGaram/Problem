package problems.silver.s4

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val m = bf.readLine().toInt()
    val cabinet = mutableMapOf<Int, Int>()
    val answer = StringBuilder()

    for (i in 0 until m) {
        val request = bf.readLine().split(" ")
        val w = request.last().toInt()

        when (request.first()) {
            "1" -> {
                val n = request[1].toInt()
                cabinet[w] = n
            }
            "2" -> {
                answer.append("${cabinet[w]}\n")
            }
        }
    }

    print(answer)
}