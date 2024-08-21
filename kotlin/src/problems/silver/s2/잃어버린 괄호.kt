package src.problems.silver

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val formula = readLine()
    // 빼기 기호 뒤로 괄호를 묶어야 함.
    val subListMinus = formula.split("-")
    // - 로 split 후 +로 연결된 모든 수를 더한다.
    // 55 - 50 + 40
    // 55, 50 + 40
    // 55, 90
    val resultList = mutableListOf<Int>()
    for (i in subListMinus.indices) {
        val splitPlus = subListMinus[i].split("+")
        splitPlus.sumOf { it.toInt() }
        // + 를 기준으로 분할한 리스트의 길이가 1보다 크다(더할 항목들이 존재함.)
        if (splitPlus.size > 1) resultList.add(splitPlus.sumOf { it.toInt() })
        else resultList.add(subListMinus[i].toInt())
    }

    // 첫 번째 데이터를 제외한 모든 데이터를 빼준다.
    var result = resultList.first()
    for (i in 1 until resultList.size) {
        result -= resultList[i]
    }
    println(result)
}