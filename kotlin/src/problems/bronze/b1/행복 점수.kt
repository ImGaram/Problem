package problems.bronze.b1

import java.io.BufferedReader
import java.io.InputStreamReader
import java.math.BigDecimal
import java.math.RoundingMode

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val string = readLine().split(" ")

    // sad, happy
    var sadCnt = 0
    var happyCnt = 0
    for (s in string) {
        for (c in s) {
            when(c) {
                'S' -> sadCnt++
                'A' -> {
                    sadCnt++
                    happyCnt++
                }
                'D' -> sadCnt++
                'H' -> happyCnt++
                'P' -> happyCnt++
                'Y' -> happyCnt++
            }
        }
    }

    if (happyCnt == 0 && sadCnt == 0) {
        println("50.00")
    } else {
        val percentage: BigDecimal = (happyCnt / (happyCnt + sadCnt).toDouble() * 100).toBigDecimal()
        println(percentage.setScale(2, RoundingMode.HALF_UP))
    }
}