package problems.gold.g5

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val k = bf.readLine().toInt()
    val lectures = mutableListOf<Triple<Int, Int, Int>>()

    for (i in 0 until k) {
        val (n, s, e) = bf.readLine().split(" ").map { it.toInt() }
        lectures.add(Triple(n, s, e))
    }
    lectures.sortBy { it.third }
    lectures.sortBy { it.second }

    var lectureNum = 1
    var endTime = lectures[0].third
    lectures.removeFirst()

    while (lectures.isNotEmpty()) {
        val bsResIndex = binarySearch(lectures, endTime)

        if (bsResIndex in lectures.indices) {
            endTime = lectures[bsResIndex].third
            lectures.removeAt(bsResIndex)
        } else {
            lectureNum++
            endTime = lectures[0].third
            lectures.removeFirst()
        }
    }

    println(lectureNum)
}

private fun binarySearch(list: MutableList<Triple<Int, Int, Int>>, endTime: Int, si: Int = 0, ei: Int = list.lastIndex): Int {
    val mi = (si + ei) / 2
    if (si > ei) return si

    return if (list[mi].second >= endTime) binarySearch(list, endTime, si, mi - 1)
    else binarySearch(list, endTime, mi + 1, ei)
}