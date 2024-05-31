package src.problems.gold

import java.util.*

// 50 60 70 80 => 520
// 110(50+60)
// 150(70+80)
// 260
// 카드를 합치는 순서(예시: 10, 20, 30, 40)
// 카드들에서 가장 작은 값과 그 다음으로 작은 값을 더함(리스트에서 삭제)
// 결과: 30, 30, 40
// 반복하기
// 우선순위 큐: 공부하기.
fun main() = with(Scanner(System.`in`)) {
    val case = nextInt()
    val pq = PriorityQueue<Int>()
    var result = 0

    for (i in 0 until case) {
        val card = nextInt()
        pq.add(card)
    }

    while (pq.size > 1) {
        val minIndex = pq.poll()
        val min2thIndex = pq.poll()

        result += minIndex + min2thIndex
        pq.add(minIndex + min2thIndex)
    }

    println(result)
}