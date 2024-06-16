package problems.silver

import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val teamMember = mutableListOf<List<Int>>()

    for (i in 1..3) {
        teamMember.add(listOf(nextInt(), nextInt()))
    }

    val ccw = ccw(
        teamMember[0][0], teamMember[0][1],
        teamMember[1][0], teamMember[1][1],
        teamMember[2][0], teamMember[2][1]
    )

    if (ccw == 0) println("WHERE IS MY CHICKEN?")
    else println("WINNER WINNER CHICKEN DINNER!")
}

private fun ccw(x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int): Int {
    val a = x1 * y2 + x2 * y3 + x3 * y1
    val b = y1 * x2 + y2 * x3 + y3 * x1
    return a - b
}