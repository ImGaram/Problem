package problems.silver.s4

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val treasureCnt = readLine().toInt()
    val treasureA = readLine().split(" ").map { it.toInt() }.toMutableList()
    val treasureB = readLine().split(" ").map { it.toInt() }.toMutableList()

    treasureB.sort()

    var price = 0
    for (i in 0 until treasureCnt) {
        val maxA = treasureA.max()
        price += treasureB[i] * maxA
        treasureA.remove(maxA)
    }

    println(price)
}