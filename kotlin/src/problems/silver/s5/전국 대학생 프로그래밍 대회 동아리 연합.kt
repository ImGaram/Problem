package problems.silver.s5

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val (n, b, h, w) = bf.readLine().split(" ").map { it.toInt() }

    var answer = Int.MAX_VALUE
    for (hi in 0 until h) {
        val p = bf.readLine().toInt()
        val a = bf.readLine().split(" ").map { it.toInt() }

        if (a.count { it >= n } == 0) continue

        val resP = n * p
        if (answer > resP && b >= resP) answer = resP
    }

    if (answer == Int.MAX_VALUE) println("stay home")
    else println(answer)
}