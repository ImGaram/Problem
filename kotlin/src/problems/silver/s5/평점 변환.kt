package problems.silver.s5

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val n = bf.readLine().toInt()
    val str = bf.readLine().map { it.toString() }
    val gradeList = listOf("A+", "A0", "A", "A-", "B+", "B0", "B", "B-", "C+", "C0", "C", "C-")

    var grade = ""
    val answer = StringBuilder()
    var before = ""
    for (i in str.indices) {
        if (!gradeList.contains(grade + str[i])) {
            answer.append(gradeToRate(grade, before))

            before = grade
            grade = ""
        }
        grade += str[i]
    }
    answer.append(gradeToRate(grade, before))

    println(answer)
}

private fun gradeToRate(grade: String, before: String): String {
    return when (grade) {
        "C+", "C0", "C", "C-" -> "B"
        "B0", "B", "B-" -> if (listOf("C+", "C0", "C", "C-").contains(before) || before.isEmpty()) "D" else "B"
        "A-", "B+" -> if (listOf("A+", "A0", "A", "A-", "B+").contains(before) && before.isNotEmpty()) "D" else "P"
        "A0", "A" -> if (listOf("A+", "A0", "A").contains(before) && before.isNotEmpty()) "P" else "E"
        "A+" -> "E"
        else -> ""
    }
}