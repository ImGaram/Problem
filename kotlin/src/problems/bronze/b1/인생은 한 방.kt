package problems.bronze.b1

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val lottoSize = readLine().toInt()
    val lotto = readLine()

    var count = 1
    for (i in 0 until lottoSize-1) {
        if (count == 5) break
        if (abs(lotto[i].code - lotto[i+1].code) == 1) count++
        else count = 1
    }

    if (count == 5) println("YES")
    else println("NO")
}