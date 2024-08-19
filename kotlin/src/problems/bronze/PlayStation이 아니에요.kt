package problems.bronze

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val size = readLine().toInt()
    val str = readLine().map { it.toString() }.toMutableList()
    val is4And5Index = mutableListOf<Int>()

    for (i in 0 until size) {
        if (str[i] == "4" || str[i] == "5") {
            is4And5Index.add(i)
        }
    }

    for (index in is4And5Index) {
        var string = ""
        if (index in 2 until str.size) {
            for (i in index - 1 downTo 0) {
                if (string.length == 2) break
                if (str[i] != " ") string += str[i]
            }

            if (string == "SP") {
                str[index] = " "
            }
        }
    }

    println(str.joinToString("").replace(" ", ""))
}