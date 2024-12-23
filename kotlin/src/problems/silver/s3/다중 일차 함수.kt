package problems.silver.s3

import java.io.BufferedReader
import java.io.InputStreamReader

private val xy = mutableListOf<List<Int>>()

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val n = bf.readLine().toInt()

    for (i in 0 until n) {
        val coordinate = bf.readLine().split(" ").map { it.toInt() }
        xy.add(coordinate)
    }
    xy.sortBy { it[0] }

    val answer = StringBuilder()
    val q = bf.readLine().toInt()
    for (i in 0 until q) {
        val k = bf.readLine().toDouble()
        val index = binarySearch(k, 0, xy.lastIndex)

        if (xy[index - 1][1] > xy[index][1]) answer.append("-1\n")
        else if (xy[index - 1][1] < xy[index][1]) answer.append("1\n")
        else answer.append("0\n")
    }

    println(answer)
}

private fun binarySearch(k: Double, start: Int, end: Int): Int {
    // index 반환하기
    if (start > end) {
        return start
    }

    val mid = (start + end) / 2

    return if (xy[mid][0] < k) {
        binarySearch(k, mid + 1, end)
    } else {
        binarySearch(k, start, mid - 1)
    }
}