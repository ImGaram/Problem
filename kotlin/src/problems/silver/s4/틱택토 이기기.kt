package problems.silver.s4

import java.io.BufferedReader
import java.io.InputStreamReader

private val map = mutableListOf<MutableList<String>>()

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val t = bf.readLine().toInt()

    for (i in 0 until t) {
        map.clear()
        val location = mutableListOf<List<Int>>()

        for (j in 0 until 3) {
            val line = bf.readLine().map { it.toString() }.toMutableList()
            map.add(line)
        }

        val user = bf.readLine()
        for (j in 0 until 3) {
            for (k in 0 until 3) {
                if (map[j][k] == user) location.add(listOf(j, k))
            }
        }
        check(user)

        println("Case ${i + 1}:")
        for (j in 0 until 3) {
            println(map[j].joinToString(""))
        }
    }
}

private fun check(user: String) {
    // 가로
    for (i in 0 until 3) {
        if (map[i].filter { it == user }.size == 2) {
            map[i] = mutableListOf(user, user, user)
            return
        }
    }

    // 세로
    for (i in 0 until 3) {  // 0
        var cnt = 0
        for (j in 0 until 3) {  // 0 1 2
            if (map[j][i] == user) cnt++
        }

        if (cnt == 2) {
            for (j in 0 until 3) {
                map[j][i] = user
            }
            return
        }
    }

    // 대각선
    val line = mutableListOf<String>()
    for (i in 0 until 3) {
        line.add(map[i][i])
    }
    if (line.filter { it == user }.size == 2) {
        for (i in 0 until 3) {
            map[i][i] = user
        }
        return
    }

    // 대각선 2
    var cnt = 0
    var j = 2
    for (i in 0 until 3) {
        if (map[i][j] == user) cnt++
        if (cnt == 2) {
            map[0][2] = user
            map[1][1] = user
            map[2][0] = user
        }

        j--
    }
}