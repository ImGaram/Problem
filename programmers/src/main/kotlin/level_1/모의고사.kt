package main.kotlin.level_1

class `모의고사` {
    // 학생 1, 2, 3이 있고, answers가 있음.
    // 학생 1, 2, 3의 정답을 규칙에 맞게 구성한다(answers의 size 만큼).
    fun solution(answers: IntArray): IntArray {
        // 각 학생들의 시험 찍는 규칙
        val stu1 = intArrayOf(1, 2, 3, 4, 5)
        val stu2 = intArrayOf(2, 1, 2, 3, 2, 4, 2, 5)
        val stu3 = intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)
        val correct = mutableListOf(0, 0, 0)

        // 정답과 학생이 찍은 답과 같으면 해당 index의 학생의 정답 수를 +1
        repeat(answers.size) {
            if (stu1[it % stu1.size] == answers[it]) correct[0]++
            if (stu2[it % stu2.size] == answers[it]) correct[1]++
            if (stu3[it % stu3.size] == answers[it]) correct[2]++
        }

        // 최댓값을 찾아 정답의 개수와 같은 학생만 result에 넣어서 return.
        val result = mutableListOf<Int>()
        for (i in correct.indices) {
            if (correct.maxOf { it } == correct[i]) result.add(i + 1)
        }

        return result.toIntArray()
    }
}

fun main() {
    println(`모의고사`().solution(intArrayOf(5, 5, 5, 5, 5, 5, 5, 5, 5, 5)))
}