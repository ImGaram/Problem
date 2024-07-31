package problems.bronze

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val plate = readLine()
    var lastPlate = '?'
    var height = 0

    for (i in plate.indices) {
        height += if (lastPlate == '?') {
            10
        } else {
            if (lastPlate == plate[i]) 5 else 10
        }
        lastPlate = plate[i]
    }

    println(height)
}