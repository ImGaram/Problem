package problems.bronze.b1

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val n = bf.readLine().toInt()
    val paints = Array(n) { Array(5) { listOf<String>() } }

    for (i in 0 until n) {
        for (j in 0 until 5) {
            val pl = bf.readLine().map { it.toString() }

            paints[i][j] = pl
        }
    }

    var resDiff = 36
    var answer = listOf<Int>()
    for (fi in paints.indices) {
        for (si in fi + 1 until paints.size) {

            var diffCnt = 0
            for (i in 0 until paints[fi].size) {
                for (j in 0 until paints[fi][i].size) {
                    if (paints[fi][i][j] != paints[si][i][j]) {
                        diffCnt++
                    }
                }
            }

            if (resDiff > diffCnt) {
                resDiff = diffCnt
                answer = listOf(fi + 1, si + 1)
            }
        }
    }

    println(answer.joinToString(" "))
}