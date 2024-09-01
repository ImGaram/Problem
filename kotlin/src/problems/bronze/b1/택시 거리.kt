package problems.bronze.b1

import java.util.Scanner
import kotlin.math.abs

fun main() = with(Scanner(System.`in`)) {
    val height = nextInt()
    val width = nextInt()

    val oneList = mutableListOf<List<Int>>()
    for (h in 0 until height) {
        for (w in 0 until width) {
            if (nextInt() == 1) oneList.add(listOf(h, w))
        }
    }

    println(abs(oneList[1][0] - oneList[0][0]) + abs(oneList[1][1] - oneList[0][1]))
}