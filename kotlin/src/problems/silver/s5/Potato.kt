package problems.silver.s5

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val plate = readLine().toInt()
    val potatoes = readLine().split(" ").map { it.toInt() }.toMutableList()
    var resultMax = 0
    var resultMin = 0

    potatoes.sortDescending()

    var repeatCnt = 0
    while (potatoes.isNotEmpty()) {
        if (repeatCnt % 2 == 0) {
            resultMax += potatoes.first()
            potatoes.removeFirst()
        } else {
            resultMin += potatoes.last()
            potatoes.removeLast()
        }
        repeatCnt++
    }

    println("$resultMin $resultMax")
}