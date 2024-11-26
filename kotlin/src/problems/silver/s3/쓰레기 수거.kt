package problems.silver.s3

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val t = bf.readLine().toInt()

    for (i in 0 until t) {
        val (w, n) = bf.readLine().split(" ").map { it.toInt() }
        var currentWeight = 0
        var move = 0
        var beforeDistance = 0

        for (j in 1 .. n) {
            val (xi, wi) = bf.readLine().split(" ").map { it.toInt() }

            // 이동
            move += xi - beforeDistance
            if (currentWeight + wi > w) {
                // 복귀 후 다시 돌아와서 수거
                move += xi * 2
                currentWeight = wi
                beforeDistance = xi
            } else if (currentWeight + wi == w) {
                // 수거 후 복귀
                move += xi
                currentWeight = 0
                beforeDistance = 0
            } else {
                // 수거
                currentWeight += wi
                beforeDistance = xi
            }

            // 마지막 쓰레기 수거 후 쓰레기가 남아 있으면 복귀
            if (j == n && currentWeight != 0) move += xi
        }

        println(move)
    }
}