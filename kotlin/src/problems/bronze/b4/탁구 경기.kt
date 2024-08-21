package problems.bronze.b4

import java.util.Scanner
import kotlin.math.abs

fun main() = with(Scanner(System.`in`)) {
    val case = nextInt()

    var scoreD = 0
    var scoreP = 0
    for (i in 0 until case) {
        // 두 사람의 점수차를 구함.
        val scoreDifference = abs(scoreP - scoreD)
        if (scoreDifference == 2) break

        val getPoint = next()
        when (getPoint) {
            "D" -> scoreD++
            "P" -> scoreP++
        }
    }

    println("$scoreD:$scoreP")
}