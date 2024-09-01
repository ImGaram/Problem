package main.kotlin.level_1

class `x만큼 간격이 있는 n개의 숫자` {
    fun solution(x: Int, n: Int): LongArray {
        val answer = mutableListOf<Long>()
        repeat(n) {
            answer.add(x.toLong() * (it+1).toLong())
        }

        return answer.toLongArray()
    }
}