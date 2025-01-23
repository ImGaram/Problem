package problems.silver.s4

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val t = bf.readLine().toInt()
    val sb = StringBuilder()

    for (i in 1 .. t) {
        val n = bf.readLine().toInt()
        val record = Array(10) { 1 }

        if (n == 0) {
            sb.append("Case #${i}: INSOMNIA\n")
            continue
        }

        var m = 1
        var thinkNum = 0
        while (record.count { it == 0 } != 10) {
            thinkNum = n * m

            for (j in thinkNum.toString()) {
                record[j.digitToInt()] = 0
            }

            m++
        }

        sb.append("Case #${i}: $thinkNum\n")
    }

    print(sb)
}