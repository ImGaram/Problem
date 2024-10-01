package problems.gold.g4

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val string = readLine()
    val boomString = readLine()
    val sb = StringBuilder()
    var subRes: String

    for (i in string.indices) {
        sb.append(string[i])
        if (string[i] == boomString.last() && sb.length >= boomString.length) {
            subRes = sb.substring(sb.lastIndex - boomString.lastIndex, sb.length)
            if (subRes == boomString) {
                sb.delete(sb.lastIndex - boomString.lastIndex, sb.length)
            }
        }
    }

    if (sb.isEmpty()) println("FRULA")
    else println(sb)
}