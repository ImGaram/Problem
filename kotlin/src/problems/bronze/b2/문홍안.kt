package problems.bronze.b2

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val property = readLine().toInt()
    val secretary = readLine().toInt()
    val steppingStone = Array(100) { "blue" }

    for (i in 0 until secretary) {
        val (block, move) = readLine().split(" ")

        when (move) {
            "R" -> {
                for (j in 99 downTo block.toInt()) {
                    steppingStone[j] = changeStoneColor(steppingStone[j])
                }
            }
            "L" -> {
                for (j in 0 until block.toInt() - 1) {
                    steppingStone[j] = changeStoneColor(steppingStone[j])
                }
            }
        }
    }

    val blueCnt = steppingStone.filter { it == "blue" }.size
    val redCnt = steppingStone.filter { it == "red" }.size
    val greenCnt = steppingStone.filter { it == "green" }.size

    val blueRes = property * (blueCnt * 0.01)
    val redRes = property * (redCnt * 0.01)
    val greenRes = property * (greenCnt * 0.01)
    println("%.2f".format(blueRes))
    println("%.2f".format(redRes))
    println("%.2f".format(greenRes))
}

private fun changeStoneColor(currentColor: String): String {
    return when (currentColor) {
        "blue" -> "red"
        "red" -> "green"
        "green" -> "blue"
        else -> ""
    }
}