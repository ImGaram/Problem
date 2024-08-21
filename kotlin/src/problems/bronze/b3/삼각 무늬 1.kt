package problems.bronze.b3

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val case = readLine().toInt()

    for (i in 0 until case) {
        var increaseValue = 1
        var result = 0
        val (equilateralTriangleA, equilateralTriangleB) = readLine().split(" ").map { it.toInt() }
        val height = equilateralTriangleA / equilateralTriangleB

        for (j in 1..height) {
            result += increaseValue
            increaseValue += 2
        }

        if (equilateralTriangleA % equilateralTriangleB != 0) result += increaseValue

        println(result)
    }
}