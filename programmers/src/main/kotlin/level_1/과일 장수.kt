package main.kotlin.level_1

import java.util.*

class `과일 장수` {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        var answer: Int = 0
        val fruitList = score.sortedArray()
        var fruitScore = k
        var addCnt = 0

        // fruitList(정렬됨)에서 m번씩 돌면서 fruit의 최소값을 구해줌.
        // answer에 최저 점수 * m을 넣어줌.
        for (i in fruitList.size-1 downTo 0) {
            fruitScore = fruitList[i]
            addCnt++

            if (addCnt == m) {
                answer += fruitScore * m
                addCnt = 0
            }
        }

        return answer
    }
}

fun main() {
    println(`과일 장수`().solution(3, 4, intArrayOf(1,2,3,1,2,3,1)))
}