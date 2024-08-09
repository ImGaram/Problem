package problems.silver

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val rooms = readLine().toInt()
    val club = StringBuilder()

    for (i in 1 .. rooms) {
        club.append(if (i == rooms) "$i" else "$i ")
    }

    val breakCnt = readLine().toInt()
    for (i in 0 until breakCnt) {
        val (start, end) = readLine().split(" ")
        val startIndex = club.indexOf(start)
        val endIndex = club.indexOf(end)

        for (j in startIndex until endIndex) {
            if (club[j] == ' ') {
                club[j] = ','
            }
        }
    }

    println(club.split(" ").size)
}