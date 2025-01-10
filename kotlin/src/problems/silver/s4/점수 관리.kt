package problems.silver.s4

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val n = bf.readLine().toInt()
    val ranking = mutableListOf<Triple<String, Int, Int>>()

    for (i in 0 until n) {
        val user = bf.readLine()
        val jsonStr = when (i) {
            0 -> user.substring(2, user.length - 2)
            else -> user.substring(1, user.length - 2)
        }

        ranking.add(parsing(jsonStr))
    }

    ranking.sortBy { it.first }
    ranking.sortByDescending { it.second }

    var rank = 1
    var sameCnt = 0
    var score = 0
    for (i in ranking.indices) {
        if (i > 0) {
            if (score == ranking[i].second) sameCnt++
            else {
                rank += sameCnt + 1
                sameCnt = 0
            }
        }

        if (ranking[i].third != 1) println("$rank ${ranking[i].first} ${ranking[i].second}")
        score = ranking[i].second
    }
}

private fun parsing(str: String): Triple<String, Int, Int> {
    val splitComma = str.split(",")
    val splitColon = splitComma.map { it.split(":").last() }

    return Triple(splitColon[0].substring(1, splitColon[0].length - 1), splitColon[1].toInt(), splitColon[2].toInt())
}