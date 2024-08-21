package problems.silver.s3

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val sevenSegmentDisplay = listOf(
        "063", "010", "093", "079", "106", "103", "119", "011", "127", "107"
    )

    while (true) {
        val formula = readLine()
        if (formula == "BYE") break

        val input = formula.substring(0, formula.length - 1).split("+")

        var resultToNumber = ""
        var resultAddToNumber = ""

        val segmentCode1 = input[0].chunked(3)
        val segmentCode2 = input[1].chunked(3)

        for (code in segmentCode1) {
            val number = sevenSegmentDisplay.indexOf(code)
            resultToNumber += number
        }
        for (code in segmentCode2) {
            val number = sevenSegmentDisplay.indexOf(code)
            resultAddToNumber += number
        }

        var answer = ""
        val resultNumber = (resultToNumber.toInt() + resultAddToNumber.toInt()).toString()
        for (num in resultNumber) {
            answer += sevenSegmentDisplay[num.digitToInt()]
        }

        println("${formula}$answer")
    }
}