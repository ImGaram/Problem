package problems.bronze.b3

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bottomSquare = readLine().toInt()
    var perimeter: Long = 0

    for (i in bottomSquare downTo 1) {
        perimeter += if (i == bottomSquare) bottomSquare + 3
        else 3
    }

    println(perimeter)
}