package problems.silver

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val case = readLine().toInt()

    for (i in 0 until case) {
        val input = readLine().split(" ").map { it.toInt() }
        val westSite = input.first()
        val eastSite = input.last()

        // DP를 사용하지 않은 단순 반복문
//        var numerator = 1.toBigInteger()       // 조합의 분자(팩토리얼)
//        var denominator = 1.toBigInteger()     // 조합의 분모(팩토리얼)
//        for (j in eastSite-westSite+1 .. eastSite) {
//            numerator *= j.toBigInteger()
//        }
//
//        for (j in 1 .. westSite) {
//            denominator *= j.toBigInteger()
//        }
//
//        println(numerator / denominator)

        // DP를 이용한 풀이.
        val combination = MutableList(westSite) {MutableList(eastSite) { 0 } }
        for (j in 0 until westSite) {
            for (k in 0 until eastSite) {
                if (j == k) combination[j][k] = 1
                else if (j == 0) combination[j][k] = k+1
                else if (k != 0) combination[j][k] = combination[j - 1][k - 1] + combination[j][k-1]
            }
        }

        println(combination[westSite-1][eastSite-1])
    }
}