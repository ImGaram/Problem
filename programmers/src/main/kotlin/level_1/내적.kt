package main.kotlin.level_1

class `내적` {
    fun solution(a: IntArray, b: IntArray): Int {
        var answer: Int = 0
        for (index in a.indices) {
            answer += a[index] * b[index]
        }

        return answer
    }
}