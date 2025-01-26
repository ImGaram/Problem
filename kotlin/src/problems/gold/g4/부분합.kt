package problems.gold.g4

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val (n, s) = bf.readLine().split(" ").map { it.toInt() }
    val nums = bf.readLine().split(" ").map { it.toInt() }

    var answer = Int.MAX_VALUE
    var sum = 0
    var si = 0
    var ei = 0
    while (ei <= n) {
        if (sum >= s) {
            if (answer > ei - si) {
                answer = ei - si
            }

            sum -= nums[si]
            si++
        } else {
            if (ei in 0 until n) sum += nums[ei]
            ei++
        }
    }

    if (answer == Int.MAX_VALUE) println(0)
    else println(answer)
}
