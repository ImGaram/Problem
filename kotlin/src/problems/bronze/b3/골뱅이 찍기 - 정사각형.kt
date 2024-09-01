package problems.bronze.b3

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val size = readLine().toInt()

    for (i in 0 until size + 2) {
        var addStr = ""

        if (i == 0 || i == size + 1) {
            for (j in 0 until size + 2) addStr += "@"
            println(addStr)
        } else {
            for (j in 0 until size + 2) {
                addStr += if (j == 0 || j == size + 1) "@" else " "
            }
            println(addStr)
        }
    }
}