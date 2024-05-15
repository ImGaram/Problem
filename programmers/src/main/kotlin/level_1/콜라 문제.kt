package main.kotlin.level_1

class `콜라 문제` {
    // 빈 병 a개를 가져다주면 콜라 b개를 준다.
    // 빈 병 n개를 주었을 때, 받을 수 있는 콜라의 개수.
    // 반복
    fun solution(a: Int, b: Int, n: Int): Int {
        var answer: Int = 0
        var emptyBottle = n

        while (emptyBottle >= a) {
            // 마트에서 받는 콜라의 양
            val coke = (emptyBottle / a) * b
            // 받는 콜라의 수만큼 answer에 추가.
            answer += coke

            // 식 (emptyBottle % a)을 사용해 emptyBottle에서 마트에 전달하고 남은 빈 병의 개수를 계산할 수 있음.
            // emptyBottle에 coke(다 마시고 빈 병이 됨)와 남은 빈 병의 개수를 더한 새로운 값으로 변경해줌.
            emptyBottle = coke + (emptyBottle % a)
        }
        return answer
    }
}

fun main() {
    println(`콜라 문제`().solution(3, 1, 20))
}