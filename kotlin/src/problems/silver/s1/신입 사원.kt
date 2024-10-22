package problems.silver.s1

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val t = bf.readLine().toInt()

    for (i in 0 until t) {
        val n = bf.readLine().toInt()
        val applicants = mutableListOf<List<Int>>()

        for (j in 0 until n) {
            val applicant = bf.readLine().split(" ").map { it.toInt() }
            applicants.add(applicant)
        }
        applicants.sortBy { it[0] }

        var answer = 1
        var passedNum = applicants[0][1]
        for (j in 1 until applicants.size) {
            if (applicants[j][1] < passedNum) {
                answer++
                passedNum = applicants[j][1]
            }
        }

        println(answer)
    }
}