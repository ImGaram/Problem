package problems.silver.s3

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val (p, n) = bf.readLine().split(" ").map { it.toInt() }
    val st = StringTokenizer(bf.readLine())
    val s = IntArray(n) { 0 }

    for (i in 0 until n) {
        if (st.hasMoreTokens()) {
            s[i] = st.nextToken().toInt()
        }
    }
    s.sort()

    var limit = p - 1
    var sum: Long = 0
    var cnt = 0
    for (i in s.indices) {
        if (limit >= s[i]) {
            sum += limit
            limit -= s[i]
            cnt++
        }
    }

    println("$cnt $sum")
}