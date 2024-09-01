package problems.silver.s3

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val cityCnt = readLine().toInt()
    val road = readLine().split(" ").map { it.toLong() }
    val gasStation = readLine().split(" ").map { it.toLong() }
    var cost = 0L
    var toAddGas = gasStation[0]

    for (i in road.indices) {
        if (gasStation[i] < toAddGas) toAddGas = gasStation[i]

        cost += toAddGas * road[i]
    }

    println(cost)
}