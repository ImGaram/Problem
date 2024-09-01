package main.kotlin.level_1

class `두 개 뽑아서 더하기` {
    // 2중 for문으로 모든 경우의 수를 계산해서 mutableList에 넣고 distinct() 하기.
    fun solution(numbers: IntArray): IntArray {
        val plusList = mutableListOf<Int>()

        // 바깥 for문은 기준 number와 index를 불러옴
        // 안쪽 for문은 바깥의 index와 같지 않은 것들만 불러와서 더해주고 list에 넣어줌.
        numbers.forEachIndexed { outIndex, number ->
            numbers.forEachIndexed { inIndex, plusValue ->
                if (outIndex != inIndex) {
                    plusList.add(number + plusValue)
                }
            }
        }

        return plusList.distinct().sorted().toIntArray()
    }
}

fun main() {
    println(`두 개 뽑아서 더하기`().solution(intArrayOf(2, 1, 3, 4, 1)))
}