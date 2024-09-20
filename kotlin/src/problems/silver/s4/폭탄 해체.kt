package problems.silver.s4

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val codes = mutableListOf<List<String>>()
    for (i in 0 until 5) {
        val codeLine = readLine().map { it.toString() }
        codes.add(codeLine)
    }

    try {
        var codeParseResult = ""
        val subCode = mutableListOf<List<String>>()
        for (j in codes[0].indices) {
            if (j % 4 == 0) {
                for (k in 0 until 5) {
                    val subCodeLine = codes[k].subList(j, j + 3)
                    subCode.add(subCodeLine)
                }

                val res = parseCode(subCode)
                codeParseResult += res
                subCode.clear()
            }
        }

        if (codeParseResult.toInt() % 6 == 0) println("BEER!!")
        else println("BOOM!!")
    } catch (e: Exception) {
        println("BOOM!!")
    }
}

private fun parseCode(compareValue: List<List<String>>): String {
    val zero = listOf(
        listOf("*", "*", "*"),
        listOf("*", " ", "*"),
        listOf("*", " ", "*"),
        listOf("*", " ", "*"),
        listOf("*", "*", "*"),
    )
    val one = listOf(
        listOf(" ", " ", "*"),
        listOf(" ", " ", "*"),
        listOf(" ", " ", "*"),
        listOf(" ", " ", "*"),
        listOf(" ", " ", "*")
    )
    val two = listOf(
        listOf("*", "*", "*"),
        listOf(" ", " ", "*"),
        listOf("*", "*", "*"),
        listOf("*", " ", " "),
        listOf("*", "*", "*"),
    )
    val three = listOf(
        listOf("*", "*", "*"),
        listOf(" ", " ", "*"),
        listOf("*", "*", "*"),
        listOf(" ", " ", "*"),
        listOf("*", "*", "*"),
    )
    val four = listOf(
        listOf("*", " ", "*"),
        listOf("*", " ", "*"),
        listOf("*", "*", "*"),
        listOf(" ", " ", "*"),
        listOf(" ", " ", "*")
    )
    val five = listOf(
        listOf("*", "*", "*"),
        listOf("*", " ", " "),
        listOf("*", "*", "*"),
        listOf(" ", " ", "*"),
        listOf("*", "*", "*"),
    )
    val six = listOf(
        listOf("*", "*", "*"),
        listOf("*", " ", " "),
        listOf("*", "*", "*"),
        listOf("*", " ", "*"),
        listOf("*", "*", "*")
    )
    val seven = listOf(
        listOf("*", "*", "*"),
        listOf(" ", " ", "*"),
        listOf(" ", " ", "*"),
        listOf(" ", " ", "*"),
        listOf(" ", " ", "*")
    )
    val eight = listOf(
        listOf("*", "*", "*"),
        listOf("*", " ", "*"),
        listOf("*", "*", "*"),
        listOf("*", " ", "*"),
        listOf("*", "*", "*")
    )
    val nine = listOf(
        listOf("*", "*", "*"),
        listOf("*", " ", "*"),
        listOf("*", "*", "*"),
        listOf(" ", " ", "*"),
        listOf("*", "*", "*")
    )

    return when (compareValue) {
        zero -> "0"
        one -> "1"
        two -> "2"
        three -> "3"
        four -> "4"
        five -> "5"
        six -> "6"
        seven -> "7"
        eight -> "8"
        nine -> "9"
        else -> throw Exception("올바르지 않은 숫자 형식")
    }
}