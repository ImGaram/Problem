package problems.silver.s3

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val sameOrder = readLine().toLong()
    var (n, m, k) = readLine().split(" ").map { it.toLong() }
    val maxDumplingCnt = (n + m + k) / sameOrder

    while ((n / sameOrder) + (m / sameOrder) + (k / sameOrder) != maxDumplingCnt) {
        if (n % sameOrder > m % sameOrder) {
            k -= (sameOrder - n % sameOrder)
            n += (sameOrder - n % sameOrder)
        } else {
            k -= (sameOrder - m % sameOrder)
            m += (sameOrder - m % sameOrder)
        }
    }

    println(k)
}