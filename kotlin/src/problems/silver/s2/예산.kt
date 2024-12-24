package problems.silver.s2

import java.io.BufferedReader
import java.io.InputStreamReader

private var m: Int = 0

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val n = bf.readLine().toInt()
    val nm = bf.readLine().split(" ").map { it.toInt() }.toTypedArray()
    m = bf.readLine().toInt()

    nm.sort()

    binarySearch(nm, 1, m)
}

private fun binarySearch(nm: Array<Int>, start: Int, end: Int) {
    if (start > end) {
        if (end == m) println(nm.max())
        else println(end)
        return
    }

    val mid = (start + end) / 2
    var tm = 0
    for (i in nm.indices) {
        tm += if (nm[i] < mid) nm[i] else mid
    }

    if (tm <= m) binarySearch(nm, mid + 1, end)
    else binarySearch(nm, start, mid - 1)
}