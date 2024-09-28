package problems.unrated

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val dart = readLine().split(" ").map { it.toInt() }

    val bobAvg = dart.sum() / 20.0
    val maxIndex = dart.indexOf(dart.max())
    var maxNearSum = dart.max()

    maxNearSum += when (maxIndex) {
        0 -> dart[19] + dart[1]
        19 -> dart[18] + dart[0]
        else -> dart[maxIndex - 1] + dart[maxIndex + 1]
    }

    val aliceAvg = maxNearSum / 3.0

    if (bobAvg < aliceAvg) println("Alice")
    else if (bobAvg > aliceAvg) println("Bob")
    else println("Tie")
}