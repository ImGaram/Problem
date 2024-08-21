package problems.silver.s3

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val case = readLine().toInt()

    for (i in 0 until case) {
        val string = readLine()
        val regex = Regex("[ABCDEF]?A+F+C+[ABCDEF]?$")

        if (regex.matches(string)) println("Infected!")
        else println("Good")
    }
}