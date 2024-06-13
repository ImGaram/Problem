package problems.silver

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val case = readLine().toInt()
    var fibonacciList: List<Int>

    for (i in 0 until case) {
        var num = readLine().toInt()
        var mile = 0

        fibonacciList = fibonacciDP(num)

        // 피보나치 진법으로 표시한 데이터.
        val fibonacciNotation = Array(fibonacciList.size) { 0 }
        for (j in fibonacciNotation.size-1 downTo 0) {
            if (num == 0) break
            if (j == fibonacciNotation.size-1) {
                fibonacciNotation[j] = 1
                num -= fibonacciList.last()
            } else {
                if (fibonacciList[j] <= num) {
                    fibonacciNotation[j] = 1
                    num -= fibonacciList[j]
                } else continue
            }
        }

        // 가장 끝의 데이터 제외하고 보기.
        for (j in 1 until fibonacciNotation.size)
            if (fibonacciNotation[j] == 1) mile += fibonacciList[j-1]

        println(mile)
    }
}

// DP를 이용한 피보나치 수열 구하기.
private fun fibonacciDP(num: Int): List<Int> {
    val fibonacci = mutableListOf(1, 2)
    var index = 2

    while (true) {
        val fibonacciNum = fibonacci[index-1] + fibonacci[index-2]
        if (fibonacciNum > num) break

        fibonacci.add(fibonacciNum)
        index++
    }

    return fibonacci
}