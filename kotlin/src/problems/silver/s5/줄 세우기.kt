package problems.silver.s5

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val case = readLine().toInt()
    val players = Array(case) { "" }

    for (i in 0 until case) {
        players[i] = readLine()
    }

    val checkArray = players.toList()
    players.sortDescending()
    if (checkArray == players.toList()) {
        println("DECREASING")
        return
    }

    players.sort()
    if (checkArray == players.toList()) {
        println("INCREASING")
        return
    }

    println("NEITHER")
}