package problems.silver

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val melon = readLine().toInt()
    val valueList = mutableListOf<Int>()
    var widthMax = 0
    var heightMax = 0

    for (i in 0 until 6) {
        val (defense, value) = readLine().split(" ").map { it.toInt() }

        when(defense) {
            1, 2 -> if (value > widthMax) widthMax = value
            3, 4 -> if (value > heightMax) heightMax = value
        }

        valueList.add(value)
    }

    val widthMaxIndex = valueList.indexOf(widthMax)
    val heightMaxIndex = valueList.indexOf(heightMax)

    val smallSquareWidth = when (widthMaxIndex) {
        0 -> abs(valueList[valueList.lastIndex] - valueList[1])
        valueList.lastIndex -> abs(valueList[widthMaxIndex - 1] - valueList[0])
        else -> abs(valueList[widthMaxIndex - 1] - valueList[widthMaxIndex + 1])
    }

    val smallSquareHeight = when (heightMaxIndex) {
        0 -> abs(valueList[valueList.lastIndex] - valueList[1])
        valueList.lastIndex -> abs(valueList[heightMaxIndex - 1] - valueList[0])
        else -> abs(valueList[heightMaxIndex - 1] - valueList[heightMaxIndex + 1])
    }

    println((widthMax * heightMax - smallSquareWidth * smallSquareHeight) * melon)
}