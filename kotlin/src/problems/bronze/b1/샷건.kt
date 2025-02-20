package problems.bronze.b1

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val key = Array(4) { arrayOf<String>() }
    val visit = Array(4) { BooleanArray(10) }

    for (t in 0 until 4) {
        val shotgun = bf.readLine().map { it.toString() }.toTypedArray()
        key[t] = shotgun
    }

    val s = bf.readLine().map { it.toString() }
    for (si in s) {
        for (i in key.indices) {
            for (j in key[i].indices) {
                if (si == key[i][j]) visit[i][j] = true
            }
        }
    }

    val dx = listOf(-1, 0, 1, -1, 0, 1, -1, 0, 1)
    val dy = listOf(-1, -1, -1, 0, 0, 0, 1, 1, 1)
    for (i in 1 until visit.lastIndex) {
        for (j in 1 until visit[i].lastIndex) {

            var count = 0
            for (m in dx.indices) {
                val mx = dx[m] + j
                val my = dy[m] + i

                if (!visit[my][mx]) break
                else count++
            }

            if (count == 9) {
                println(key[i][j])
                break
            }
        }
    }
}