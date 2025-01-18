package problems.gold.g3

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val k = bf.readLine().toInt()
    val lectures = mutableListOf<Triple<Int, Int, Int>>()
    val answer = Array(k + 1) { 0 }
    val sb = StringBuilder()

    for (i in 0 until k) {
        val (n, s, e) = bf.readLine().split(" ").map { it.toInt() }
        lectures.add(Triple(n, s, e))
    }
    lectures.sortBy { it.third }
    lectures.sortBy { it.second }

    var lectureNum = 1
    var endTime = lectures[0].third
    answer[lectures[0].first] = lectureNum
    lectures.removeFirst()

    while (lectures.isNotEmpty()) {
        val bsResIndex = binarySearch(lectures, endTime)

        if (bsResIndex in lectures.indices) {
            endTime = lectures[bsResIndex].third
            answer[lectures[bsResIndex].first] = lectureNum

            lectures.removeAt(bsResIndex)
        } else {
            lectureNum++
            endTime = lectures[0].third
            answer[lectures[0].first] = lectureNum

            lectures.removeFirst()
        }
    }

    sb.append("$lectureNum\n")
    for (i in 1 until answer.size) {
        sb.append("${answer[i]}\n")
    }

    println(sb)
}

private fun binarySearch(list: MutableList<Triple<Int, Int, Int>>, endTime: Int, si: Int = 0, ei: Int = list.lastIndex): Int {
    val mi = (si + ei) / 2
    if (si > ei) return si

    return if (list[mi].second >= endTime) binarySearch(list, endTime, si, mi - 1)
    else binarySearch(list, endTime, mi + 1, ei)
}