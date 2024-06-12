package problems.bronze

import java.util.Scanner

private var resursive = 0   // 재귀 함수 카운트
private var loop = 0        // 반복문 카운트
fun main() = with(Scanner(System.`in`)) {
    val number = nextInt()

    fibonacci(number)   // 재귀 호출

    // 반복문
    val fibonacciList = mutableListOf(1, 1)
    for (i in 3 .. number) {
        fibonacciList.add(fibonacciList[i-2] + fibonacciList[i-3])
        loop++
    }

    println("$resursive $loop")
}

private fun fibonacci(num: Int): Int {
    if (num == 2 || num == 1) {
        resursive++
        return 1
    } else return fibonacci(num - 1) + fibonacci(num - 2)
}