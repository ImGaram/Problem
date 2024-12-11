package problems.bronze.b3

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val k = bf.readLine().toInt()
    val n = bf.readLine().toInt()
    var bomb = k
    var time = 0

    for (i in 0 until n) {
        val (t, z) = bf.readLine().split(" ")

        time += t.toInt()
        if (time > 210) {
            println(bomb)
            break
        }

        if (z == "T") {
            bomb++
            if (bomb > 8) bomb = 1
        }
    }
}