package problems.silver.s5

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val n = bf.readLine().toInt()
    val list = bf.readLine().split(" ").map { it.toInt() }
    val roulette = mutableSetOf<Int>()
    var answer = 0

    for (i in list.indices) {
        if (roulette.contains(list[i])) roulette.remove(list[i])
        else roulette.add(list[i])

        answer = max(answer, roulette.size)
    }

    println(answer)
}