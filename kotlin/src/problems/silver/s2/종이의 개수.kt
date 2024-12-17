package problems.silver.s2

import java.io.BufferedReader
import java.io.InputStreamReader

private var paper = arrayOf(arrayOf<Int>())
private var cntMinus1 = 0
private var cnt0 = 0
private var cnt1 = 0

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val n = bf.readLine().toInt()
    paper = Array(n + 1) { Array(n + 1) { 0 } }

    for (i in 1 .. n) {
        val line = bf.readLine().split(" ").map { it.toInt() }

        for (j in 1 .. n) {
            paper[i][j] = line[j - 1]
        }
    }

    cutting(1, 1, n)

    println("$cntMinus1 $cnt0 $cnt1")
}

private fun cutting(x: Int, y: Int, size: Int) {
    val check = paper[y][x]
    var cnt = 0
    for (i in y until y + size) {
        for (j in x until x + size) {
            if (paper[i][j] == check) cnt++
        }
    }

    if (cnt == size * size) {
        when (check) {
            0 -> cnt0++
            1 -> cnt1++
            -1 -> cntMinus1++
        }
    } else {
        for (cy in y until  y + size step size / 3) {
            for (cx in x until x + size step size / 3) {
                cutting(cx, cy, size / 3)
            }
        }
    }
}