package problems.silver.s3

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val (n, m) = bf.readLine().split(" ").map { it.toInt() }
    val test = Array(n * m) { (Array(3) { Array(8) { "." } }) }
    val markingNumber = listOf("1", "2", "3", "4", "5", "6", "7", "8", "9", "0")
    val answer = mutableListOf<Boolean>()
    var question = 0


    for (i in 0 until n * 3) {
        val grade = bf.readLine().map { it.toString() }
        val chunkedArray = grade.chunked(8)

        for (j in chunkedArray.indices) {
            for (k in 0 until chunkedArray[0].size) {
                test[question + j][i % 3][k] = chunkedArray[j][k]
            }
        }

        if (i % 3 == 2) {
            question += chunkedArray.size
        }
    }

    for (i in test.indices) {
        for (j in test[i].indices) {
            if (j % 3 == 1) {
                // 채점
                val plusIndex = test[i][j].indexOf("+")
                val sameIndex = test[i][j].indexOf("=")
                val testAnswer = test[i][j][plusIndex - 1].toInt() + test[i][j][plusIndex + 1].toInt()
                val correct = if (markingNumber.contains(test[i][j][sameIndex + 2])) {
                    (test[i][j][sameIndex + 1] + test[i][j][sameIndex + 2]).toInt()
                } else {
                    test[i][j][sameIndex + 1].toInt()
                }

                answer.add(testAnswer == correct)
            }
        }
    }

    for (i in test.indices) {
        if (answer[i]) {
            for (j in test[i].indices) {
                if (j == 1) {
                    test[i][j][0] = "*"
                    if (test[i][j][6] == ".") test[i][j][6] = "*"
                    else test[i][j][7] = "*"
                } else {
                    val last = if (markingNumber.contains(test[i][1][6])) 7 else 6
                    for (k in 1 until last) {
                        test[i][j][k] = "*"
                    }
                }
            }
        } else {
            test[i][0][3] = "/"
            test[i][1][2] = "/"
            test[i][2][1] = "/"
        }
    }

    val res = Array(n * 3) { "" }
    var index = 0
    for (i in test.indices) {
        for (j in test[i].indices) {
            res[index + j] += test[i][j].joinToString("")
        }

        if (i % m == (m - 1)) {
            index += 3
        }
    }

    for (i in res.indices) {
        println(res[i])
    }
}