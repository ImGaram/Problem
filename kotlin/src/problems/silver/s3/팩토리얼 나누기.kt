package problems.silver.s3

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var (n, a) = readLine().split(" ").map { it.toInt() }
    var answer = 0L

    while (n / a != 0) {
       n /= a
       answer += n
    }

    println(answer)
}