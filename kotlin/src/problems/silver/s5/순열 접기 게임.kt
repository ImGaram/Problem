package problems.silver.s5

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val case = readLine().toInt()

    for (i in 1 .. case) {
        var size = readLine().toInt()
        val list = readLine().split(" ").map { it.toInt() }.toMutableList()

        while (list.size != 2) {
            val halfSize = if (list.size % 2 == 0) size / 2 - 1 else size / 2
            for (j in 0 .. halfSize) {
                if (j == size - 1 - j) {
                    list[j] = list[j] * 2
                } else {
                    list[j] = list[j] + list[size-1 - j]
                    list.removeAt(size-1 - j)
                }
            }

            size = list.size
        }

        if (list[0] > list[1]) println("Case #$i: Alice")
        else println("Case #$i: Bob")
    }
}