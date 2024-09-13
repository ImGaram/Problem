package problems.bronze.b1

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (maskW, maskB) = readLine().split(" ").map { it.toInt() }
    val (shirtW, shirtB) = readLine().split(" ").map { it.toInt() }
    val (pantsW, pantsB) = readLine().split(" ").map { it.toInt() }

    val set1Min = listOf(maskW, shirtB, pantsW).min()
    val set2Min = listOf(maskB, shirtW, pantsB).min()

    if (set1Min == set2Min) {
        println(set1Min * 2)
    } else {
        println(min(set1Min, set2Min) * 2 + 1)
    }
}