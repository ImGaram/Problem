package main.kotlin.level_1

import kotlin.math.sqrt

class `소수 만들기` {
    fun solution(nums: IntArray): Int {
        var answer = 0
        val case = mutableListOf<Int>()

        // 경우의 수 구하기
        for (i in nums.indices) {
            for (j in i + 1 until nums.size) {
                for (k in j + 1 until nums.size) {
                    case.add(nums[i] + nums[j] + nums[k])
                }
            }
        }

        // 소수 구하기
        for (data in case) {
            // 특정 수가 소수인지 확인하기 위한 변수.
            var isPrimeNum = false
            // 숫자의 제곱근 값
            val sqrt = sqrt(data.toDouble()).toInt()

            // 2부터 제곱근 값만큼 반복
            // 1은 소수가 아니므로 넘어가고, 2부터 제곱근까지 수까지 반복하면서 i의 배수가 되는 숫자들을 제외시키면 소수를 구할 수 있다.
            for (i in 2 .. sqrt) {
                // else는 소수가 아님.
                if (data % i != 0) isPrimeNum = true
                else {
                    isPrimeNum = false
                    break
                }
            }
            println("소수 결과: ${data}는 소수인가? => $isPrimeNum")
            if (isPrimeNum) answer++
        }

        return answer
    }
}

fun main() {
    println(`소수 만들기`().solution(intArrayOf(1,2,7,6,4)))
}