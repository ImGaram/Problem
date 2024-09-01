package problems.gold.g5

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val case = readLine().toInt()
    val regex = Regex("(100+1+|01)+")

    for (i in 0 until case ) {
        val code = readLine()

        if (regex.matches(code)) println("YES")
        else println("NO")
    }
}