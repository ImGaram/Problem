package problems.silver.s2

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    // 전원의 개수: a, 모터의 개수: b, 케이블의 개수: c
    val abc = bf.readLine().split(" ").map { it.toInt() }
    val status = Array(abc.sum() + 1) { -1 }
    val n = bf.readLine().toInt()
    val partI = Array(n) { 0 }
    val partJ = Array(n) { 0 }
    val partK = Array(n) { 0 }
    val partR = Array(n) { 0 }

    for (z in 0 until n) {
        // 전원 번호: i, 모터 번호: j, 케이블 번호: k, 검사 결과: r
        val (i, j, k, r) = bf.readLine().split(" ").map { it.toInt() }
        partI[z] = i
        partJ[z] = j
        partK[z] = k
        partR[z] = r

        if (r == 1) {
            status[i] = 1
            status[j] = 1
            status[k] = 1
        }
    }

    for (i in 0 until n) {
        if (partR[i] == 0) {
            val sum = status[partI[i]] + status[partJ[i]] + status[partK[i]]

            // 1이 2개 있고 -1이 1개 있는 경우
            if (sum == 1) {
                if (status[partI[i]] == -1) status[partI[i]] = 0
                else if (status[partJ[i]] == -1) status[partJ[i]] = 0
                else if (status[partK[i]] == -1) status[partK[i]] = 0
            }
        }
    }

    for (i in 1 until status.size) {
        if (status[i] == -1) status[i] = 2
        println(status[i])
    }
}