package main.kotlin.level_1

import kotlin.math.sqrt

class `기사단원의 무기` {
    fun solution(number: Int, limit: Int, power: Int): Int {
        var answer: Int = 0

        repeat(number) { num ->
            val divisors = mutableListOf<Int>()

            // 약수 구하는 방법
            // N의 약수를 구할 때는, 1부터 N의 제곱근까지의 수만 0으로 나누어 떨어지는지 체크.
            // 이미 구해진 약수들에 N을 나누어 추가적인 약수를 구할 수 있음.
            val sqrt = sqrt((num+1).toDouble()).toInt()
            for (i in 1..sqrt+1) {
                if ((num+1) % i == 0) {
                    divisors.add(i)
                }
            }

            var divisorCnt = divisors.size
            divisors.forEach {
                if (!divisors.contains((num+1) / it)) divisorCnt++
            }
            println("${num+1}까지의 약수의 개수: $divisorCnt")

            answer += if (divisorCnt > limit) power else divisorCnt
        }

        return answer
    }
}

fun main() {
    println(`기사단원의 무기`().solution(10, 3, 2))
}