package problems.bronze.b1

import java.io.BufferedReader
import java.io.InputStreamReader
import java.text.DecimalFormat

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val grade = mapOf(
        "A+" to 4.3, "A0" to 4.0, "A-" to 3.7,
        "B+" to 3.3, "B0" to 3.0, "B-" to 2.7,
        "C+" to 2.3, "C0" to 2.0, "C-" to 1.7,
        "D+" to 1.3, "D0" to 1.0, "D-" to 0.7,
        "F" to 0.0,
    )
    val subjectCnt = readLine().toInt()

    var totalScore = 0.0
    var totalCredits = 0
    for (i in 0 until subjectCnt) {
        val subjectGrade = readLine().split(" ")
        val credits = subjectGrade[1].toInt()
        val gradeNumber = grade[subjectGrade.last()]!!

        totalCredits += credits
        totalScore += credits * gradeNumber
    }

    val decimalFormat = DecimalFormat("#.00")
    val average = String.format("%.2f", totalScore / totalCredits).toDouble()
    println(decimalFormat.format(average))
}