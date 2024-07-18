package problems.silver

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val size = readLine().toInt()
    var cnt = 0

    for (i in 1 .. size / 3 + 1) {
        for (j in i .. max(size - i, i)) {
            val left = size - i - j

            if (left < j) break
            if (left < i + j) cnt++
        }
    }

    println(cnt)
}