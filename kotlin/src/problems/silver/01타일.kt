package problems.silver

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val tileCnt = readLine().toInt()
    val array = Array(tileCnt + 1) { 1 }

    for (i in 2 .. tileCnt) {
        array[i] = (array[i - 1] + array[i - 2]) % 15746
    }

    println(array[tileCnt])
}