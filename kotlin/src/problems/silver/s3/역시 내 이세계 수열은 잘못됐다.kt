package problems.silver.s3

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max
import kotlin.math.min

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val (n, k) = bf.readLine().split(" ").map { it.toInt() }
    val a = bf.readLine().split(" ").map { it.toInt() }
    var cnt: Long = 0

    for (i in 0 until n / 2) {
        val target = a.lastIndex - i

        if (a[i] != a[target]) {
            val big = max(a[i], a[target])
            val small = min(a[i], a[target])

            val cnt1 = (big - small) / k + (big - small) % k
            val divValue = (big - small) / k + 1
            val cnt2 = divValue + (k * divValue + small - big) % k

            cnt += min(cnt1, cnt2)
        }
    }

    println(cnt)
}