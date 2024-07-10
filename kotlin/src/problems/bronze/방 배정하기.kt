package problems.bronze

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (r1, r2, r3, students) = readLine().split(" ").map { it.toInt() }
    var result = 0

    for (i1 in 0 .. students / r1) {
        for (i2 in 0 .. students / r2) {
            for (i3 in 0 .. students / r3) {
                val case = (i1 * r1) + (i2 * r2) + (i3 * r3)
                if (case == students) result = 1
            }
        }
    }

    println(result)
}