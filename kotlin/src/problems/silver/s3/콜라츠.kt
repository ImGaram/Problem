package problems.silver.s3

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val t = bf.readLine().toInt()

    for (i in 0 until t) {
        val n = bf.readLine().toInt()
        var answer = n / 2 + n % 2
        answer += if (n % 6 == 0 || n % 6 == 4) n / 3 else n / 3 + 1

        println(answer)
    }
}