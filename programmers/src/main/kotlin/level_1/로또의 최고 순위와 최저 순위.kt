package level_1

class `로또의 최고 순위와 최저 순위` {
    // 로또의 순위는 1~6까지 있음
    // 1이 6개의 번호가 모두 일치할 때, 6이 한개 이하로 맞았을 때
    // 알 수 없는 번호는 0으로 치고, 자신이 구매한 로또 번호의 최고 순위와 최저 순위를 알아보자.
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        val answer = mutableListOf<Int>()
        var correctCount = 0

        repeat(2) { repeat ->
            lottos.forEach {
                if (it == 0 && repeat == 0) correctCount++
                if (win_nums.indexOf(it) > -1) correctCount++
            }

            when (correctCount) {
                6 -> answer.add(1)
                5 -> answer.add(2)
                4 -> answer.add(3)
                3 -> answer.add(4)
                2 -> answer.add(5)
                else -> answer.add(6)
            }
            correctCount = 0
        }

        println(answer)
        return answer.toIntArray()
    }
}

fun main() {
    `로또의 최고 순위와 최저 순위`().solution(intArrayOf(44, 1, 0, 0, 31, 25), intArrayOf(31, 10, 45, 1, 6, 19))
}