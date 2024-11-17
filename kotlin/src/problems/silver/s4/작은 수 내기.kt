package problems.silver.s4

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val n = bf.readLine().toInt()
    val me = bf.readLine().split(" ").map { it.toInt() }.toMutableList()
    val enemy = bf.readLine().split(" ").map { it.toInt() }.toMutableList()
    me.sort()
    enemy.sortDescending()

    var cardIndex = me.lastIndex
    var point = 0
    for (ei in 0 until enemy.size) {
        while (me[cardIndex] >= enemy[ei]) {
            cardIndex--
            if (cardIndex == -1) break
        }

        if (cardIndex == -1) {
            if (point * 2 > n) println("YES")
            else println("NO")

            return
        } else {
            me[cardIndex] = 100001
            point++
        }
    }

    println("YES")
}