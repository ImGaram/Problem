package problems.silver.s5

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val (n, g) = bf.readLine().split(" ")
    val player = mutableSetOf<String>()
    val with = if (g == "Y") 1 else if (g == "F") 2 else 3

    for (ni in 0 until n.toInt()) {
        val user = bf.readLine()
        player.add(user)
    }

    println(player.size / with)
}