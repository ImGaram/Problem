package problems.gold.g1

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

private var size: Int = 0
private var index: Int = 0
private var answer = 0

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    size = readLine().toInt()
    index = readLine().toInt()

    binarySearch(1, index)
}

private fun binarySearch(start: Int, end: Int) {
    val mid = (start + end) / 2
    if (start > end) {
        println(answer)
        return
    }

    var cnt = 0
    for (i in 1 .. size) {
        cnt += min(mid / i, size)
    }

    if (cnt < index) binarySearch(mid + 1, end)
    else {
        answer = mid
        binarySearch(start, mid - 1)
    }
}