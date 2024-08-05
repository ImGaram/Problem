package problems.silver

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

private var tanghulu = listOf<Int>()

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    readLine().toInt()
    tanghulu = readLine().split(" ").map { it.toInt() }
    var answer = 0

    for (i in 1 .. 9) {
        for (j in i + 1 .. 9) {
            answer = max(answer, getLongestTanghulu(i, j))
        }
    }

    println(answer)
}

private fun getLongestTanghulu(i: Int, j: Int): Int {
    var res = 0
    var cnt = 0

    for (k in tanghulu.indices) {
        if (tanghulu[k] == i || tanghulu[k] == j) {
            cnt++
        } else {
            res = max(res, cnt)
            cnt = 0
        }
    }

    res = max(res, cnt)
    return res
}