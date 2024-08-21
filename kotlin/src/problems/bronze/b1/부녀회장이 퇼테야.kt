package src.problems.bronze

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val case = readLine().toInt()

    repeat(case) {
        val floor = readLine().toInt()
        val room = readLine().toInt()
        val list = MutableList(floor+1) { MutableList(room) { 0 } }

        // 파스칼의 삼각형 알고리즘.
        // 구하고자 하는 수는 왼쪽 숫자와 위쪽 숫자의 합.
        for (i in 0..floor) {
            if (i == 0) {
                repeat(room) {
                    list[0][it] = it+1
                }
            } else {
                list[i][0] = 1
                for (j in 1 until room) {
                    list[i][j] = list[i-1][j] + list[i][j-1]
                }
            }
        }

        println(list[floor][room-1])
    }
}