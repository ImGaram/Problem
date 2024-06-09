package src.problems.silver

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val difficultyList = mutableListOf<Int>()
    val case = readLine().toInt()

    for (i in 0 until case) {
        difficultyList.add(readLine().toInt())
    }

    val difficultyArray = difficultyList.toTypedArray()
    Arrays.sort(difficultyArray)

    if (case == 0) {
        println(0)
        return
    }
    // 시작, 끝부분에서 지워야 하는 배열의 크기.
    // 그냥 round를 쓰면 안됨. 반올림을 제대로 못하는 경우가 있음.
    val cuttingIndex = round(difficultyArray.size * 0.15).toInt()
    val cuttingList = difficultyArray.toMutableList().subList(cuttingIndex, difficultyArray.size - cuttingIndex)
    val average = round(cuttingList.sum().toDouble(), cuttingList.size.toDouble())
    println(average.toInt())
}

// 두 숫자의 평균을 계산.
private fun round(num1: Double, num2: Double = 1.0): Double {
    val result = (num1 / num2).toString().split(".")
    return if (result.last()[0].digitToInt() >= 5) result.first().toDouble() + 1
    else result.first().toDouble()
}