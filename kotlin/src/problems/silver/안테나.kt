package problems.silver

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import kotlin.math.abs

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val case = readLine().toInt()
    val houses = StringTokenizer(readLine())
    val house = Array(case) { 0 }

    for (i in 0 until case) {
        house[i] = houses.nextToken().toInt()
    }

    house.sort()
    val mid = house.size / 2
    if (house.size % 2 == 0) {
        val midRes = house.sumOf { abs(it - house[mid]).toLong() }
        val midResMin1 = house.sumOf { abs(it - house[mid - 1]).toLong() }

        if (midRes == midResMin1) println(house[mid - 1])
        else println(house[mid])
    } else println(house[mid])
}