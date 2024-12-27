package problems.silver.s5

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val n = bf.readLine().toInt()
    var sum: Long = 0
    var answer = 0

    for (i in 1 .. n) {
        sum += i
        if ((n - sum) >= 0 && (n - sum) % i == 0L) answer++
    }

    println(answer)
}