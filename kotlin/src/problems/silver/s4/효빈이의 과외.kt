package problems.silver.s4

import java.io.BufferedReader
import java.io.InputStreamReader

private const val mod = 1000000007

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val matrixCnt = readLine().toInt()
    var frontMatrix = mutableListOf<List<Long>>()
    val backMatrix = mutableListOf<List<Long>>()
    var isAble = true
    var bc = 0

    for (i in 0 until matrixCnt) {
        val (x, y) = readLine().split(" ").map { it.toInt() }

        for (j in 0 until x) {
            val matrixRow = readLine().split(" ").filter { it.isNotEmpty() }.map { it.toLong() }
            if (i == 0) {
                frontMatrix.add(matrixRow)
            } else {
                backMatrix.add(matrixRow)
            }
        }

        if (i > 0) {
            if (bc != x) isAble = false
            if (isAble) {
                frontMatrix = matrixMultiplication(frontMatrix, backMatrix)
                backMatrix.clear()
            }
        }

        bc = y
    }

    if (!isAble) println(-1)
    else {
        var sum = 0L
        for (i in 0 until frontMatrix.size) {
            for (j in 0 until frontMatrix[i].size) {
                sum = (sum + frontMatrix[i][j]) % mod
            }
        }

        println(sum)
    }
}

private fun matrixMultiplication(list1: List<List<Long>>, list2: List<List<Long>>): MutableList<List<Long>> {
    val answer = mutableListOf<List<Long>>()

    for (i in list1.indices) {
        val answerList = mutableListOf<Long>()
        for (j in 0 until list2[0].size) {
            var m = 0L
            for (k in 0 until list1[0].size) {
                m += (list1[i][k] * list2[k][j]) % mod
            }
            answerList.add(m)
        }
        answer.add(answerList)
    }

    return answer
}