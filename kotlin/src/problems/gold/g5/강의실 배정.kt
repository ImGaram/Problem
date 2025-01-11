package problems.gold.g5

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val n = bf.readLine().toInt()
    val lecture = mutableListOf<Pair<Int, Int>>()

    for (i in 0 until n) {
        val (s, t) = bf.readLine().split(" ").map { it.toInt() }
        lecture.add(Pair(s, t))
    }

    lecture.sortBy { it.second }
    lecture.sortBy { it.first }

    var classCnt = 1
    var endTime = lecture.first().second
    lecture.removeFirst()

    while (lecture.isNotEmpty()) {
        val bsResIndex = binarySearch(lecture, endTime, 0)

        if (bsResIndex in lecture.indices) {
            endTime = lecture[bsResIndex].second
            lecture.removeAt(bsResIndex)
        } else {
            classCnt++
            endTime = lecture[0].second
            lecture.removeFirst()
        }
    }

    println(classCnt)
}

private fun binarySearch(list: List<Pair<Int, Int>>, endTime: Int, si: Int, ei: Int = list.lastIndex): Int {
    val mi = (si + ei) / 2
    if (si > ei) return si

    return if (list[mi].first >= endTime) binarySearch(list, endTime, si, mi - 1)
    else binarySearch(list, endTime, mi + 1, ei)
}