package problems.silver

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val students = readLine().toInt()
    var studentList = mutableListOf<List<String>>()

    for (i in 0 until students) {
        // 입력값
        // 이름, 재학 여부, 역대 ICPC 수상 여부, 역대 shake! 최고 성적, 2024 APC 성적
        val studentInfo = readLine().split(" ")
        studentList.add(studentInfo)
    }

    studentList = studentList
        .filter { it[1] == "jaehak" && it[2] == "notyet" }
        .filter { it[3].toInt() > 3 || it[3].toInt() == -1 }
        .toMutableList()

    if (studentList.size >= 10) {
        studentList.sortBy { it.last().toInt() }
        studentList = studentList.subList(0, 10)
    }
    println(studentList.size)

    studentList.sortBy { it[0] }
    println(studentList.joinToString("\n") { it[0] })
}