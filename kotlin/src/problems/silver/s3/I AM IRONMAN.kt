package problems.silver.s3

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val (n, p) = bf.readLine().split(" ").map { it.toInt() }
    val (w, l, g) = bf.readLine().split(" ").map { it.toInt() }

    val hacking = mutableMapOf<String, String>()
    for (i in 0 until p) {
        val (player, lp) = bf.readLine().split(" ")
        hacking[player] =  lp
    }

    var lp = 0
    var answer = "I AM IRONMAN!!"
    for (i in 0 until n) {
        val player = bf.readLine()

        if (hacking.containsKey(player)) {
            when (hacking[player]) {
                "W" -> lp += w
                "L" -> lp -= l
            }
        } else {
            lp -= l
        }

        if (lp < 0) lp = 0
        else if (lp >= g) {
            answer = "I AM NOT IRONMAN!!"
            break
        }
    }

    println(answer)
}