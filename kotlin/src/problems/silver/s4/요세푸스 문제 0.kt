package src.problems.silver

import java.util.LinkedList
import java.util.Queue
import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val personQueue: Queue<Int> = LinkedList((1..nextInt()).toList())
    val deleteNumber = nextInt()

    val result = StringBuilder()
    var deleteCount = 0
    while (true) {
        // 큐의 크기가 1이면 deleteNumber 만큼 돌 필요가 없어서 삭제하고 break.
        if (personQueue.size == 1) {
            result.append(personQueue.remove())
            break
        }
        // 삭제 카운트 증가
        deleteCount++
        if (deleteCount == deleteNumber) {
            // 삭제 카운트가 deleteNumber면 맨 앞의 사람을 삭제.
            result.append("${personQueue.remove()}, ")
            // deleteCount 0으로 초기화.
            deleteCount = 0
        } else {
            // 삭제 카운트가 deleteNumber가 아니면 맨 앞사람을 뒤로 보냄.
            val moveLast = personQueue.poll()
            personQueue.add(moveLast)
        }
    }

    println("<${result}>")
}