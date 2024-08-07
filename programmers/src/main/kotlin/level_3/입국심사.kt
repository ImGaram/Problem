package main.kotlin.level_3

class `입국심사` {
    private var examiner = listOf<Long>()
    private var people = 0
    private var answer: Long = 0

    fun solution(n: Int, times: IntArray): Long {
        times.sort()
        examiner = times.map { it.toLong() }
        people = n

        binarySearch(0, examiner.last() * people)
        println(answer)

        return answer
    }

    private fun binarySearch(start: Long, end: Long) {
        if (start > end) return

        val mid = (end + start) / 2L
        val res = examiner.sumOf { mid / it }

        if (res < people) {
            binarySearch(mid + 1, end)
        } else {
            answer = mid
            binarySearch(start, mid - 1)
        }
    }
}

fun main() {
    입국심사().solution(6, intArrayOf(7, 10))
}