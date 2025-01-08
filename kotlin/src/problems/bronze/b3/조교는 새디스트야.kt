package problems.bronze.b3

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val n = bf.readLine().toInt()
    val nums = StringTokenizer(bf.readLine())
    var answer = 0

    for (i in 1 .. n) {
        val num = nums.nextToken().toInt()

        if (num != i) answer++
    }

    println(answer)
}