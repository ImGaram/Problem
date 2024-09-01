package problems.silver.s3

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val case = readLine().toInt()
    val stairsScore = mutableListOf(0)

    for (i in 1 .. case)
        stairsScore.add(readLine().toInt())

    // 계단의 점수들의 합(최적)
    val totalScoreList = Array(case+1) { 0 }
    totalScoreList[1] = stairsScore[1]
    if (case >= 2) totalScoreList[2] = stairsScore[1] + stairsScore[2]

    for (i in 3 .. case) {
        // max의 첫 번째 항목: 1계단 -> 2계단을 오르는 경우(1계단 이후의 2계단은 stairsScore[i]이기 때문에 max 연산에서 제외됨.)
        // max의 두 번째 항목: 2계단 -> 1계단으로 계단을 오르는 경우
        totalScoreList[i] = max(totalScoreList[i-2], totalScoreList[i-3] + stairsScore[i-1]) + stairsScore[i]
    }

    println(totalScoreList[case])
}