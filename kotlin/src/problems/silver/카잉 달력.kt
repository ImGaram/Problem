package problems.silver

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val case = readLine().toInt()
    val sb = StringBuilder()

    for (i in 0 until case) {
        val (m, n, x, y) = readLine().split(" ").map { it.toInt() }
        val gcd = if (m > n) gcd(m, n) else gcd(n, m)
        val lcm = m * n / gcd

        var year = -1
        for (j in x .. lcm step m) {
            val ry = if (j % n == 0) n else j % n

            if (ry == y) {
                year = j
                break
            }
        }

        sb.append("${year}\n")
    }

    println(sb)
}

private fun gcd(b: Int, s: Int): Int {
    val r = b % s
    return if (r == 0) s
    else gcd(s, r)
}