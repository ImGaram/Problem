package src.problems.silver

import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val case = nextInt()

    repeat(case) {
        val parenthesis = next()
        val parenthesisList = parenthesis.toMutableList()
        var result = "YES"

        while (parenthesisList.contains('(')) {
            if (parenthesisList[0] == '(') {
                parenthesisList.removeAt(0)
                val matchIndex = parenthesisList.indexOf(')')

                if (matchIndex != -1) {
                    parenthesisList.removeAt(matchIndex)
                } else {
                    result = "NO"
                    break
                }
            } else {
                result = "NO"
                break
            }
        }

        if (parenthesisList.isNotEmpty()) result = "NO"

        println(result)
    }
}