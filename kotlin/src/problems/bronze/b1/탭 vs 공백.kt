package problems.bronze.b1

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val n = bf.readLine().toInt()

    val tab = Array(367) { 0 }
    val space = Array(367) { 0 }
    var a5long = 0

    for (i in 0 until n) {
        val (c, s, e) = bf.readLine().split(" ")

        for (d in s.toInt() .. e.toInt()) {
            if (c == "T") tab[d]++
            else space[d]++
        }

        a5long = max(a5long, e.toInt() - s.toInt())
    }

    val answer = Array(6) { 0 }
    // 1
    for (d in 1 .. 366) {
        if (tab[d] > 0 || space[d] > 0) answer[1]++
    }

    // 2
    for (d in 1 .. 366) {
        answer[2] = max(answer[2], tab[d] + space[d])
    }

    // 3
    for (d in 1 .. 366) {
        if (tab[d] == space[d] && tab[d] > 0 && space[d] > 0) answer[3]++
    }

    // 4
    val peaceful = Array(367) { 0 }
    for (d in 1 .. 366) {
        if (tab[d] == space[d] && tab[d] > 0 && space[d] > 0) peaceful[d] = 1
        if (peaceful[d] == 1) {
            answer[4] = max(answer[4], tab[d] * 2)
        }
    }

    // 5
    answer[5] = a5long + 1

    for (i in 1 .. 5) {
        println(answer[i])
    }
}