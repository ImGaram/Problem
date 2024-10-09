package problems.bronze.b1

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    val string = readLine()
    val numList = listOf('0', '1', '2', '3', '4', '5', '6', '7', '8', '9')
    var sum = 0L
    val number = mutableListOf<Char>()

    for (c in string) {
        if (numList.contains(c)) {
            number.add(c)
        } else {
            if (number.isNotEmpty()) {
                sum += number.joinToString("").toLong()
                number.clear()
            }
        }
    }

    if (number.isNotEmpty()) {
        sum += number.joinToString("").toLong()
    }
    println(sum)
}