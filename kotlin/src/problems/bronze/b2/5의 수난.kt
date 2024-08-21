package problems.bronze.b2

import java.util.Scanner
import kotlin.math.pow

fun main() = with(Scanner(System.`in`)) {
    val num = next().map { it.digitToInt() }
    var res = 0

    for (i in num) {
        res += i.toDouble().pow(5).toInt()
    }

    println(res)
}