package problems.bronze.b2

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (students, cards) = readLine().split(" ").map { it.toInt() }
    val studentTickets = Array(students + 1) { 0 }

    for (i in 1 .. students) {
        val numberTicket = readLine().toInt()
        studentTickets[i] = numberTicket
    }

    for (i in 1 .. cards) {
        for (card in 2 until studentTickets.size) {
            if (studentTickets[card - 1] % i > studentTickets[card] % i) {
                val temp = studentTickets[card - 1]
                studentTickets[card - 1] = studentTickets[card]
                studentTickets[card] = temp
            }
        }
    }

    val sb = StringBuilder()
    for (i in 1 until studentTickets.size) {
        sb.append("${studentTickets[i]}\n")
    }
    println(sb)
}