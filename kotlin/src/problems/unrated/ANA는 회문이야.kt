package problems.unrated

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val length = readLine().toInt()
    val string = readLine().map { it.toString() }
    var checking = ""
    var ana = 0

    for (s in string) {
        if (checking.contains("A") && s == "A") {
            checking += s
            val nCnt = checking.count { it == 'N' }

            if (nCnt == 1) ana++
            checking = "A"
        } else {
            if (s == "A") checking = "A"
            else checking += s
        }
    }

    println(ana)
}