package problems.bronze.b2

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val case = readLine().toInt()

    for (i in 0 until case) {
        val (tickets, seats) = readLine().split(" ").map { it.toInt() }
        val soldSeats = mutableListOf<Int>()
        var soldCnt = 0

        for (j in 0 until tickets) {
            val seat = readLine().toInt()

            if (soldSeats.contains(seat)) soldCnt++
            else soldSeats.add(seat)
        }

        println(soldCnt)
    }
}