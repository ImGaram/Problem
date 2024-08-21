package problems.bronze.b1

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val pieces = readLine().split(" ").map { it.toInt() }.toMutableList()

    while (true) {
        var isChanged = false

        for (i in 0 until pieces.size - 1) {
            if (pieces[i] > pieces[i + 1]) {
                val save = pieces[i]
                pieces[i] = pieces[i + 1]
                pieces[i + 1] = save

                isChanged = true

                println(pieces.joinToString(" "))
            }
        }

        if (!isChanged) break
    }
}