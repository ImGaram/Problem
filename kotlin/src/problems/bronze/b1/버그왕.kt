package problems.bronze.b1

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val string = mutableListOf<String>()

    while (true) {
        val str = readLine() ?: break
        string.add(str)
    }

    for (i in string.indices) {
        while (true) {
            val replaceValue = string[i].replace("BUG", "")

            if (replaceValue == string[i]) break
            else string[i] = replaceValue
        }

        println(string[i])
    }
}