package problems.silver.s4

import java.io.BufferedReader
import java.io.InputStreamReader
import java.time.LocalDate

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val day = listOf(
        listOf(0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31),
        listOf(0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31),
    )
    val check = listOf(
        listOf(0, 1, 2),
        listOf(2, 1, 0),
        listOf(2, 0, 1)
    )

    val (y, m, d) = bf.readLine().split(" ").map { it.toInt() }
    val n = bf.readLine().toInt()
    val sb = StringBuilder()

    for (i in 0 until n) {
        val date = bf.readLine().split(" ").map { it.toInt() }
        var answer = "invalid"

        for (j in check.indices) {
            val yy = date[check[j][0]]
            val mm = date[check[j][1]]
            val dd = date[check[j][2]]

            if (mm in 1..12 && dd in 1 .. day[if (yy % 4 == 0) 1 else 0][mm]) {
                answer = if (LocalDate.of(y, m, d) > LocalDate.of(yy, mm, dd)) "unsafe"
                else "safe"

                if (answer == "unsafe") break
            }
        }

        sb.append("$answer\n")
    }

    println(sb)
}