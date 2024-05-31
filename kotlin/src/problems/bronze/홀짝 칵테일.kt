package src.problems.bronze

import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val evens = mutableListOf<Int>()
    var result = 1

    repeat(3) {
        // 우선순위, 홀수 -> 짝수, 큰 수 -> 작은 수
        // 홀수가 있는 경우: 짝수 데이터는 곱하지 않음.
        // 홀수가 없는 경우: 짝수를 모두 곱함.

        val cocktail = nextInt()
        if (cocktail % 2 != 0) result *= cocktail
        else evens.add(cocktail)
    }

    if (evens.size == 3) {
        // reduce로 for문을 돌리지 않고 list의 모든 데이터의 곱을 구할 수 있음.
        println(evens.reduce { total, cocktail -> total * cocktail })
    } else println(result)
}