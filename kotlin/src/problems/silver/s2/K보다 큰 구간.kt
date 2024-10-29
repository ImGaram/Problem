package problems.silver.s2

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val n = bf.readLine().toInt()
    val array = bf.readLine().split(" ").map { it.toLong() }
    val k = bf.readLine().toLong()

    var sum = 0L
    var answer = 0L
    var start = 0
    var end = 0
    while (true) {
        if (sum > k) {
            answer += n - end + 1
            sum -= array[start++]
        } else if (end >= n) {
            break
        } else {
            sum += array[end++]
        }
    }

    println(answer)
}