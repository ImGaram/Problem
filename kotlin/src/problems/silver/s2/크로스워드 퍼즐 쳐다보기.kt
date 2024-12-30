package problems.silver.s2

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val (r, c) = bf.readLine().split(" ").map { it.toInt() }
    val puzzle = Array(r) { listOf<String>() }

    for (i in 0 until r) {
        val line = bf.readLine().map { it.toString() }
        puzzle[i] = line
    }

    val puzzleAns = mutableSetOf<String>()
    var res: String

    // 가로
    for (i in 0 until r) {
        res = ""
        for (j in 0 until c) {
            if (puzzle[i][j] == "#") {
                if (res.length >= 2) puzzleAns.add(res)
                res = ""
            } else {
                res += puzzle[i][j]
            }
        }

        if (res.length >= 2) puzzleAns.add(res)
    }

    // 세로
    for (i in 0 until c) {
        res = ""
        for (j in 0 until r) {
            if (puzzle[j][i] == "#") {
                if (res.length >= 2) puzzleAns.add(res)
                res = ""
            } else {
                res += puzzle[j][i]
            }
        }

        if (res.length >= 2) puzzleAns.add(res)
    }

    println(puzzleAns.minOf { it })
}