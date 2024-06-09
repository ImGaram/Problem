package src.problems.silver

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val case = readLine().toInt()
    val numList = mutableListOf<Int>()

    for (i in 0 until case) {
        numList.add(readLine().toInt())
    }

    // 산술평균: n개의 수의 합을 n으로 나눈 값. 소수점 이하 첫째 자리에서 반올림한 값.
    val sumAverage = round(numList.sum() / numList.size.toDouble())
    if (sumAverage == -0.0) println("0")
    else println(sumAverage.toInt())

    // 중앙값: n개의 수를 증가하는 값으로 나열한 후 그 중앙에 위치하는 값.
    val sortList = numList.sorted()
    val middle = if (sortList.size % 2 != 0) {
        sortList[sortList.size / 2]
    } else {
        (sortList[(sortList.size - 1) / 2] + sortList[(sortList.size - 1) / 2]) / 2
    }
    println(middle)

    // 최빈값: n개의 수들 중 가장 많이 나타나는 값. 여러 개인 경우 최빈값 중 두 번째로 작은 값을 출력.
    val many = numList.groupBy { it }       // list를 데이터를 기준으로 그룹화
    val manyMaxSize = many.values.maxBy { it.size }.size        // 그룹화된 리스트에서 가장 많이 존재하는 데이터의 길이
    val manyFrequency = many.entries.filter { it.value.size == manyMaxSize }.map { it.key }.toMutableList()     // 가장 많이 존재하는 데이터의 길이와 같은 데이터를 모두 불러오기.
    if (manyFrequency.size >= 2) manyFrequency.remove(manyFrequency.min())
    println(manyFrequency.min())

    // 범위: n개의 수들 중 최댓값과 최솟값의 차이.
    val max = numList.max()
    val min = numList.min()
    val range = max - min
    println(range)
}

private fun round(num1: Double, num2: Double = 1.0): Double {
    val resultDecimal = (num1 / num2).toString().split(".")
    val result = num1 / num2
    return if (result > 0) {
        if (resultDecimal.last()[0].digitToInt() >= 5) resultDecimal.first().toDouble() + 1
        else resultDecimal.first().toDouble()
    } else {
        if (resultDecimal.last()[0].digitToInt() >= 5) resultDecimal.first().toDouble() - 1
        else resultDecimal.first().toDouble()
    }
}