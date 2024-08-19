package problems.silver

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import kotlin.math.abs

private data class Balloon(
    val number: Int,
    var paper: Int
)

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val balloon = mutableListOf<Balloon>()
    val cnt = readLine().toInt()
    val numbers = StringTokenizer(readLine())

    for (i in 0 until cnt) {
        balloon.add(Balloon(i + 1, numbers.nextToken().toInt()))
    }

    val answer = StringBuilder()
    var popIndex = 0
    while (balloon.isNotEmpty()) {
        var rotateCnt = if (popIndex > 0) 1 else 0

        if (popIndex != 0) {
            while (rotateCnt != abs(popIndex)) {
                if (popIndex > 0) {
                    val first = balloon.first()
                    balloon.removeFirst()
                    balloon.add(first)
                } else {
                    val last = balloon[balloon.lastIndex]
                    balloon.removeLast()
                    balloon.add(0, last)
                }

                rotateCnt++
            }
        }

        answer.append("${balloon.first().number} ")
        popIndex = balloon.first().paper
        balloon.removeAt(0)
    }

    println(answer)
}