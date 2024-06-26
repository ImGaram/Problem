package problems.bronze

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    while (true) {
        val (a, b) = readLine().split(" ").map { it.toInt() }
        if (a == 0 && b == 0) break

        if (a > b) println("Yes")
        else println("No")
    }
}