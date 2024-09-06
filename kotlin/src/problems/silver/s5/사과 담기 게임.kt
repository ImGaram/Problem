package problems.silver.s5

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (size, basket) = readLine().split(" ").map { it.toInt() }
    val apples = readLine().toInt()

    var basketFront = 1
    var basketBack = basket
    var answer = 0
    for (i in 0 until apples) {
        val fallingLocation = readLine().toInt()

        if (fallingLocation > basketBack) {
            while (fallingLocation != basketBack) {
                basketBack++
                basketFront++

                answer++
            }
        } else if (fallingLocation < basketFront) {
            while (fallingLocation != basketFront) {
                basketFront--
                basketBack--

                answer++
            }
        }
    }

    println(answer)
}