package src.problems.bronze

import java.util.Scanner
import kotlin.math.pow

fun main() = with(Scanner(System.`in`)) {
    nextInt()
    val string = next()
    val mod = 1234567891

    var result: Long = 0
    var powValue = 31.0.pow(0.0).toLong()
    for (i in string.indices) {
        val charNumber = string[i].code - 96
        result += charNumber * powValue % mod
        powValue = (powValue * 31) % mod
    }

    println(result % mod)
}