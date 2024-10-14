package problems.silver.s5

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val t = readLine().toInt()

    for (i in 0 until t) {
        val n = readLine().toInt()
        var s = readLine()

        while (true) {
            val replaceS = s.replace("ABB", "BA")
            if (replaceS == s) {
                println(replaceS)
                break
            }

            s = replaceS
        }
    }
}