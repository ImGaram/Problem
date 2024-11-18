package problems.silver.s3

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val t = bf.readLine().toInt()

    for (i in 0 until t) {
        val (x, y, mx, my) = bf.readLine().split(" ").map { it.toInt() }
        val map = Array(y) { Array(x) { 0 } }
        var cnt = 0

        for (h in 0 until y) {
            for (w in 0 until x) {
                if (h - my >= 0 && w - mx >= 0 && map[h - my][w - mx] == 1) continue
                map[h][w] = 1
                cnt++
            }
        }

        println(cnt)
    }
}