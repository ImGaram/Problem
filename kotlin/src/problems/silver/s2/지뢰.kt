package problems.silver.s2

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val n = bf.readLine().toInt()
    var boomIndex = -1
    var before = 0

    for (i in 0 until n) {
        val p = bf.readLine().toInt()
        if (i != 0) {
            if (boomIndex == -1 && before >= p) {
                boomIndex = i

                println(boomIndex)
            }

            if (boomIndex != -1 && before <= p) {
                boomIndex = -1
            }
        }

        before = p
        if (i == n - 1) {
            if (boomIndex == -1) println(n)
        }
    }
}