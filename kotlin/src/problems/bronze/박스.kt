package problems.bronze

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val case = readLine().toInt()

    for (c in 0 until case) {
        val (h, w) = readLine().split(" ").map { it.toInt() }
        val map = Array(h) { mutableListOf<Int>() }

        for (i in 0 until h) {
            val box = readLine().split(" ").map { it.toInt() }
            map[i].addAll(box)
        }

        var move = 0
        while (true) {
            var isMove = false
            for (bh in map.indices) {
                for (bw in map[0].indices) {
                    if (map[bh][bw] == 1) {
                        val downH = bh + 1
                        if (downH in map.indices && map[downH][bw] == 0) {
                            map[bh][bw] = 0
                            map[downH][bw] = 1

                            move++
                            isMove = true
                        }
                    }
                }
            }

            if (!isMove) break
        }

        println(move)
    }
}