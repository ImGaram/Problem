package problems.silver.s5

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (bookCnt, weight) = readLine().split(" ").map { it.toInt() }
    if (bookCnt == 0) {
        println(0)
        return
    }

    val books = readLine().split(" ").map { it.toInt() }
    var currentWeight = 0
    var boxCnt = 0

    for (i in 0 until bookCnt) {
        val bookWeight = books[i]

        if (bookWeight + currentWeight <= weight) {
            currentWeight += bookWeight
        } else {
            currentWeight = bookWeight
            boxCnt++
        }
    }

    if (currentWeight != 0) boxCnt++
    println(boxCnt)
}