package problems.silver.s5

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val nm = StringTokenizer(bf.readLine())
    val n = nm.nextToken().toInt()
    val m = nm.nextToken().toInt()

    val bessie = mutableListOf(0)
    val elsie = mutableListOf(0)

    for (ni in 0 until n) {
        // 베시
        val cow = StringTokenizer(bf.readLine())
        val speed = cow.nextToken().toInt()
        val h = cow.nextToken().toInt()

        for (hi in 0 until h) {
            bessie.add(bessie.last() + speed)
        }
    }

    for (mi in 0 until m) {
        // 엘시
        val cow = StringTokenizer(bf.readLine())
        val speed = cow.nextToken().toInt()
        val h = cow.nextToken().toInt()

        for (hi in 0 until h) {
            elsie.add(elsie.last() + speed)
        }
    }

    var frontLine = ""
    var changeCnt = 0
    for (i in bessie.indices) {
        if (bessie[i] != elsie[i]) {
            if (frontLine.isEmpty()) {
                if (bessie[i] > elsie[i]) frontLine = "bessie"
                else frontLine = "elsie"
            } else {
                if (bessie[i] > elsie[i] && frontLine == "elsie") {
                    frontLine = "bessie"
                    changeCnt++
                } else if (bessie[i] < elsie[i] && frontLine == "bessie") {
                    frontLine = "elsie"
                    changeCnt++
                }
            }
        }
    }

    println(changeCnt)
}