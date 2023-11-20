package level_1

class `명예의 전당(1)` {
    fun solution(k: Int, score: IntArray): IntArray {
        val answer = mutableListOf<Int>()
        val winDequeue = ArrayDeque<Int>()

        score.forEach { scoreInfo ->
            var addIndex: Int? = null

            if (winDequeue.isEmpty()) winDequeue.add(scoreInfo)
            else {
                for (queueItem in winDequeue) {
                    if (scoreInfo >= queueItem) {
                        addIndex = winDequeue.indexOf(queueItem)
                        break
                    }
                }

                if (addIndex != null) winDequeue.add(addIndex, scoreInfo)
                else winDequeue.addLast(scoreInfo)
                if (winDequeue.size > k) winDequeue.removeLast()
            }

            answer.add(winDequeue.last())
        }

        println(answer)
        return answer.toIntArray()
    }
}

fun main() {
    `명예의 전당(1)`().solution(2, intArrayOf(10, 0, 0, 0, 0, 0, 0))
}