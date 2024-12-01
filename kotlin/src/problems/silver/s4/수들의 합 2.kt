package problems.silver.s4

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val (n, m) = bf.readLine().split(" ").map { it.toInt() }
    val list = bf.readLine().split(" ").map { it.toInt() }
    var answer = 0

    for (s in list.indices) {
        var sum = list[s]
        var isBreak = false
        for (e in s + 1 until list.size) {
            if (sum == m) {
                answer++
                isBreak = true
                break
            } else if (sum > m) {
                isBreak = true
                break
            } else {
                sum += list[e]
            }
        }

        if (!isBreak && sum == m) answer++
    }

    println(answer)
}