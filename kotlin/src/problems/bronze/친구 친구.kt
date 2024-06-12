package problems.bronze

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val case = readLine().split(" ").map { it.toInt() }

    val friends = MutableList(case.first()) { 0 }
    for (i in 0 until case.last()) {
        val input = readLine().split(" ").map { it.toInt() }
        friends[input.first()-1]++
        friends[input.last()-1]++
    }

    for (i in 0 until friends.size) {
        println(friends[i])
    }
}