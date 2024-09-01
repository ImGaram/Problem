package src.problems.silver

import java.util.*

fun main() = with(Scanner(System.`in`)){
    // queue 선언 방법
    val queue: Queue<Int> = LinkedList((1 .. nextInt()).toList())

    while (queue.size > 1) {
        queue.remove()      // 맨 앞의 데이터를 제거
        val toBack = queue.poll()   // 맨 앞의 데이터를 제거하면서 제거한 값을 불러오기
        queue.add(toBack)       // 제거한 값을 queue의 맨 뒤로 옮기기.
    }

    println(queue.peek())
}