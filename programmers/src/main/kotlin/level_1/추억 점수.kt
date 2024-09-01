package level_1

class `추억 점수` {
    // name 리스트의 이름과, 각 인물의 그리움 점수가 존재함.

    fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray {
        val scoreMap = mutableMapOf<String, Int>()
        val answer = mutableListOf<Int>()

        repeat(name.size) {
            scoreMap[name[it]] = yearning[it]
        }

        var totalScore = 0
        repeat(photo.size) {
            totalScore = 0
            for (people in photo[it]) {
                if (scoreMap[people] != null) {
                    totalScore += scoreMap[people]!!
                }
            }

            answer.add(totalScore)
        }

        return answer.toIntArray()
    }
}