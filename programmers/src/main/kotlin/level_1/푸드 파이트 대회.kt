package main.kotlin.level_1

class `푸드 파이트 대회` {
    // 2명이 동일한 양의 음식을 먹어야 함(7이면 2명이 3개씩 먹고 1개는 버려짐).
    // 먹어야 하는 횟수만큼 string으로 return하면 됨.
    fun solution(food: IntArray): String {
        var setFood = ""
        food.forEachIndexed { foodNum, foodCount ->
            // 한 사람이 먹어야 하는 음식의 양
            val eat = foodCount / 2
            // eat가 0이면(음식의 개수가 2개 미만) 음식을 나눌 수 없기에 continue
            // 이 조건으로 0번째 index인 물의 양을 추가 코드 없이 넘어갈 수 있음.
            if (eat == 0) {
                // for문의 continue와 같은 뜻.
                return@forEachIndexed
            } else {
                // 음식 배치 변수(setFood)에 food의 index(foodNum)만큼 추가
                repeat(eat) {
                    setFood += foodNum
                }
            }
        }

        return setFood + "0" + setFood.reversed()
    }
}

fun main() {
    println(`푸드 파이트 대회`().solution(intArrayOf(1, 3, 4, 6)))
}