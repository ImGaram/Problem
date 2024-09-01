package problems.bronze.b3

import java.io.BufferedReader
import java.io.InputStreamReader
import java.text.DecimalFormat
import kotlin.math.round

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val pi = 3.1415927
    var trip = 1

    while (true) {
        val (diameter, rotation, sec) = readLine().split(" ").map { it.toDouble() }
        val decimalFormat = DecimalFormat("0.00")   // 소수점을 둘째자리까지 보이도록 고정시키기 위함.

        if (rotation == 0.0) break
        val moveDirection = diameter / 12 / 5280 * pi * rotation    // 이동 거리.
        val milesPerHour = moveDirection / (sec / 3600)
        val resultDirection = round(moveDirection * 100) / 100
        val resultMilesPerHour = round(milesPerHour * 100) / 100

        println("Trip #$trip: ${decimalFormat.format(resultDirection)} ${decimalFormat.format(resultMilesPerHour)}")
        trip++
    }
}