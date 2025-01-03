package problems.silver.s4

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

private var map = arrayOf(arrayOf<Int>())

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val (r, c) = bf.readLine().split(" ").map { it.toInt() }
    map = Array(r) { Array(c) { 0 } }

    for (i in 0 until r) {
        val noiseLine = StringTokenizer(bf.readLine())
        for (j in 0 until c) {
            val noise = noiseLine.nextToken().toInt()
            map[i][j] = noise
        }
    }

    val t = bf.readLine().toInt()
    var answer = 0

    for (cr in 0 .. r - 3) {
        for (cc in 0 .. c - 3) {
            val j = getV(cr, cc)
            j.sort()

            if (j[4] >= t) answer++
        }
    }

    println(answer)
}

private fun getV(r: Int, c: Int): MutableList<Int> {
    val res = mutableListOf<Int>()

    for (cr in r until r + 3) {
        for (cc in c until c + 3) {
            res.add(map[cr][cc])
        }
    }

    return res
}