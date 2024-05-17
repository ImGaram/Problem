package main.kotlin.level_1

class `부족한 금액 계산하기` {
    fun solution(price: Int, money: Int, count: Int): Long {
        var answer: Long = 0
        var totalMoney: Long = 0
        repeat(count) {
            totalMoney += price * (it+1)
        }

        answer = money.toLong() - totalMoney
        // answer(남은 돈)이 0원 미만일 때: 돈이 모자름.
        return if (answer < 0) answer * -1L
        else 0L
    }
}

fun main() {
    println(`부족한 금액 계산하기`().solution(2500, 4, 2500))
}