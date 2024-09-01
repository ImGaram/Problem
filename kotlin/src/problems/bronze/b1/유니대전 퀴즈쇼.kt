package problems.bronze.b1

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (case, correctPerson) = readLine().split(" ")
    val chattingInfo = mutableListOf<List<String>>()
    var correctIndex = 0
    var correct = ""

    for (i in 0 until case.toInt()) {
        val (person, chatting) = readLine().split(" ")

        if (person == correctPerson) {
            correctIndex = i
            correct = chatting
        }
        chattingInfo.add(listOf(person, chatting))
    }

    var disappoint = 0
    for (i in correctIndex - 1 downTo 0) {
        if (chattingInfo[i].last() == correct) disappoint++
    }

    println(disappoint)
}